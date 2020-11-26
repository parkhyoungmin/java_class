-- 16_뷰.sql

/*
    # 뷰(View)
        - 물리적인 기본 테이블들을 이용해 생성한 논리적인 가상의 테이블
        - 기본 테이블에서 파생된 객체
        - 사용자는 주어진 뷰를 통해 기본 테이블을 제한적으로 사용하게 된다
        
        CREATE [OR VIEW] [FORCE | NOFORCE] VIEW 뷰이름 AS 서브쿼리[(별칭, 별칭, ..)]
                    [WITH CHECK OPTION]
                    [WITH READ ONLY];
        - CREATE OR REPLACE : 이미 존재하는 VIEW이름을 사용하면 해당 VIEW를 수정한다
        - FORCE : 기본 테이블의 존재 여부에 상관없이 뷰를 생성한다
        - WITH CHECK OPTION : 해당 뷰를 통해 볼 수 있는 범위 내에서만 UPDATE와 INSERT가 가능해진다
        - WITH READ ONLY : 해당 뷰는 SELECT만 가능하며 INSERT/UPDATE/DELETE를 할 수 없게 된다
*/
CREATE OR REPLACE VIEW ABC_VIEW
AS SELECT 
    first_name, last_name, salary, department_name
FROM
    employees INNER JOIN departments USING(department_id);

SELECT * FROM ABC_VIEW;

CREATE OR REPLACE VIEW DEPT30_VIEW AS
    SELECT
        first_name,
        job_id,
        department_id
    FROM
        employees
    WHERE
        department_id = 30;

SELECT * FROM dept30_view;

-- 연습문제01: 사원번호/사원이름/부서번호/매니저번호/매니저이름을 쉽게 확인할 수 있는 
-- EMP_MGR_VIEW를 생성해보세요
CREATE OR REPLACE VIEW EMP_MGR_VIEW AS
    SELECT
        a.employee_id,
        a.last_name,
        a.department_id,
        a.manager_id,
        b.last_name AS manager_name
    FROM
      --  employees a, employees b
        LEFT OUTER JOIN employees b ON a.manager_id = b.employee_id;
--    WHERE
--        a.manager_id = b.employee_id;
SELECT * FROM EMP_MGR_VIEW;
DROP VIEW EMP_MGR_VIEW;


-- force : 기본테이블이 존재하지 않더라도 강제로 뷰를 생성한다
CREATE OR REPLACE FORCE VIEW no_table_view AS
    SELECT
        employee_id,
        department_id
    FROM
        empployeees
    WHERE
        department_id = 30;

SELECT * FROM user_views;
SELECT * FROM no_table_view;

-- 테이블이 나중에 생성되면 작동할 뷰를 미리 작성해 놓을 때 사용한다 
CREATE TABLE empployeees AS SELECT * FROM employees;

/*
    # 뷰에 대한 쿼리가 수행되는 과정
        1. 사용자가 뷰에 대한 쿼리문을 실행한다 (SELECT, INSERT, UPDATE, DELETE)
        2. 권한을 살핀다
        3. 사용자가 입력한 쿼리문을 기본 테이블에 대한 쿼리문으로 변환한다
        4. 변환된 기본 테이블에 대한 쿼리문을 이용해 데이터를 검색한다
        5. 검색된 결과를 출력한다
        
    # 하나의 테이블만 이용하는 뷰를 단순 뷰라고 부르고,
    조언을 통해 두 개 이상의 테이블을 이용하는 뷰를 복합 뷰라고 부른다.
*/

CREATE TABLE emp3 AS SELECT * FROM employees;

/*
    # WITH CHECK OPTION
        - 이 뷰를 상성할 때 조건에 사용된 컬럼은 뷰를 통해서는 변경할 수 없도록 한다
        - 뷰를 생성할 때 발생할 수 있는 혼란을 최소화한다
*/
DROP VIEW chk_view30;
CREATE OR REPLACE VIEW chk_view30 AS
    SELECT
        employee_id,
        first_name,
        last_name,
        salary,
        email,
        hire_date,
        job_id,
        department_id
    FROM
        emp3
    WHERE
        department_id = 30
WITH CHECK OPTION;

-- VIEW를 통해 작업하던 중 부서 이동이 필요한 상황이 발생했다고 가정
SELECT * FROM chk_view30 WHERE salary < 3000; 
UPDATE chk_view30 SET department_id = 20 WHERE salary < 3000;

/*
    # WITH READ ONLY
        - WITH CHECK OPTION은 뷰의 조건으로 사용한 컬럼의 변경만 막지만
        WITH READ ONLY는 모든 컬럼에 대한 변경을 막는다
        - 뷰를 통해 기본 테이블을 절대 변경할 수 없도록 막는다
*/
CREATE OR REPLACE VIEW r_only_view30 AS
    SELECT
        employee_id,
        first_name,
        last_name,
        salary,
        department_id
    FROM
        emp3
    WHERE
        department_id = 30
WITH READ ONLY;

-- chk_view30뷰에 DML을 이용하여 뷰를 수정하면 
-- 실제로는 기본 테이블에 모든 것이 반영된다 
UPDATE chk_view30 SET salary = 20000;

-- 뷰를 통해 추가는 가능하지만, 
-- 해당 뷰만으로는 emp3테이블의 모든 NOT NULL컬럼을 채울 수 없어서 INSERT가 불가능
-- chk_view30을 통해서는 30번 부서의 사람만 INSERT가 가능하다 (뷰 생성시 부서가 30번 이었으므로)
INSERT INTO chk_view30 VALUES(1, '길동', '홍', 500, 'GILDONGHONG', sysdate, '백수', 30); 
SELECT * FROM emp3 WHERE department_id = 30;

-- 뷰는 기본 테이블의 내용을 확인하는 것이기 때문에 다른 뷰에서 변환한 내용도 당연히 적용된다 
SELECT * FROM r_only_view30;
UPDATE r_only_view30 SET salary = 2000;











