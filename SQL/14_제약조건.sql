-- 14_제약조건

/*
    # 데이터 무결성
        - 데이터가 항상 유지해야 하는 성질
        - 데이터가 정확성 + 일관성을 유지하기 위해 필요한 것
        
        - 개체 무결성
            하나의 행을 구분할 수 있는 컬럼이 반드시 존재해야 한다
            테이블에는 반드시 PK(Primary Key)가 존재해야 한다
        - 참조 무결성
            참조 관계에 있는 데이터가 항상 일관된 값을 가져야 한다
            외래키는 반드시 참조하는 테이블에 존재하는 값을 사용해야 한다
        - 도메인 무결성
            해당 컬럼의 값의 타입이 일정해야 한다
    # 데이터 무결성 제약 조건
        - 테이블에 무결성을 해치는 부적절한 데이터가 입력되는것을 방지하기 위한 규칙
        - NOT NULL : 해당 컬럼에 NULL을 허용하지 않는 규칙
        - UNIQUE : 해당 컬럼에 중복값을 허용하지 않는 규칙. 항상 유일한 값을 갖도록 한다.
        - PRIMARY KEY : NOT NULL + UNIQUE. 해당 컬럼이 기본키가 된다
        - FOREIGN KEY : 외래키로 설정된 컬럼은 참조하는 컬럼에 존재하는 값만 추가할 수 있다
        - CHECK : 데이터의 범위나 조건을 직접 지정하여 도메인 무결성을 유지할 수 있다
*/

-- # 제약조건 데이터 딕셔너리 뷰를 통해 테이블의 제약조건을 확인할 수 있다
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';
SELECT * FROM all_constraints WHERE owner = 'HR' AND table_name = 'DEPARTMENTS';

/*
    # 제약 조건 테이블 보는 방법
    
        - CONSTRAINT_TYPE
            P : Primary Key
            R : Foreign Key
            C : Check or Not Null
            U : UNIQUE
        - R_이 붙은 컬럼들은 해당 외래키가 참조하는 컬럼(PK, UNIQUE)의 정보를 담고 있다
            R_OWNER : 참조하는 테이블의 소유자
            R_CONSTRAINT_NAME : 외래키가 참조하는 컬럼의 제약조건
*/

-- # 테이블 생성시 제약조건 정의하기
CREATE TABLE FRUITS (
    fid number(10) primary key,
    fname VARCHAR2(30) not null
);

DESC fruits;
SELECT
    *
FROM user_constraints WHERE table_name = 'FRUITS';

-- # 컬럼 추가 시 제약조건 정의하기
ALTER TABLE FRUITS ADD (
    color varchar2(10) not null
);

/*
     ※ 제약조건을 정의할 때 제약조건명을 지정하지 않으면 오라클이 제약조건명을 자동으로 부여한다
     오라클이 자동으로 부여한 제약조건명으로는 어떤 제약조건을 위반했는지 알기 힘들기 때문에
     제약조건명을 반드시 지정하는 것이 좋다

    # 제약조건 명명 규칙 : [테이블명]_[컬럼명]_[제약조건 유형]
        ex : EMP_DEPT_FK
             DEPT_ID_PK
             DEPT_LOC_FK
             DEPT_NAME-NN
*/

-- # 제약조건명과 함께 제약조건 정의하는 방법
ALTER TABLE fruits ADD (
    sweet number(4, 2) CONSTRAINT fruit_sweet_nn not null,
    fsize number(2) CONSTRAINT fruit_size_stan CHECK(fsize BETWEEN 10 AND 20)
);

DESC fruits;
SELECT
    *
FROM user_constraints WHERE table_name = 'FRUITS';

INSERT INTO fruits VALUES(1, '배', 'brown', 8.88, -5);

/*
    연습문제01 : 학생 테이블을 생성하되 다음과 같은 제약조건을 지켜서 만들어보세요
    
        학생번호 4자리 정수
        학생이름 10글자 가변문자, NOT NULL 
        학생성별 1글자 고정문자, 값으로는 M 또는 F만 허용
        학생성적 1글자 고정문자, 값으로는 A,B,C,D,F만 허용, NOT NULL 
        핸드폰번호 13글자 고정문자, 오라클 정규표현식 함수를 이용해 핸드폰 정규식을 만족하는 경우만 허용, NOT NULL
        
        ※ 모든 제약 조건이 자동 생성된 제약 조건명이 아니어야 함
*/

CREATE TABLE STUDENTS (
    s_num NUMBER(4),
    s_name VARCHAR2(10) NOT NULL,
    s_gender CHAR(1) CONSTRAINT s_gender_ck CHECK(s_gender IN('M','F')),
    s_score CHAR(1) CONSTRAINT s_score_grade_ck CHECK(s_score IN('A','B','C','D','F')) NOT NULL,
    s_phone CHAR(13) CONSTRAINT s_phone_ck CHECK(s_phone IN (s_phone, '(.{3})(.+)(.{4})', '\1-\2-\3')) NOT NULL
);

DESC students;

COMMIT;
INSERT INTO 
    students(s_num, s_name, s_gender, s_score, s_phone) 
VALUES 
    (0001, '김철수', 'M', 'B', '010-1234-5678');
    
INSERT INTO 
    students(s_num, s_name, s_gender, s_score, s_phone) 
VALUES 
    (0002, '김영희', 'F', 'A', '010-9012-3456');

ROLLBACK;

SELECT * FROM STUDENTS;
DROP TABLE STUDENTS PURGE;

-- 하나의 컬럼에 제약조건 여러개 추가할 때
ALTER TABLE fruits ADD (
    fsize NUMBER(2)
        CONSTRAINT fruit_size_stan CHECK (fsize BETWEEN 10 AND 20)
        CONSTRAINT fruit_size_nn NOT NULL
);

-- ---------------------------------------------------------------------------------
/*
    연습문제01 : 학생 테이블을 생성하되 다음과 같은 제약조건을 지켜서 만들어보세요
    
        학생번호 4자리 정수
        학생이름 10글자 가변문자, NOT NULL 
        학생성별 1글자 고정문자, 값으로는 M 또는 F만 허용
        학생성적 1글자 고정문자, 값으로는 A,B,C,D,F만 허용, NOT NULL 
        핸드폰번호 13글자 고정문자, 오라클 정규표현식 함수를 이용해 핸드폰 정규식을 만족하는 경우만 허용, NOT NULL
        
        ※ 모든 제약 조건이 자동 생성된 제약 조건명이 아니어야 함
*/

-- column-level constrain
CREATE TABLE STUDENTS (
    s_num NUMBER(4) 
        CONSTRAINT S_num_PK PRIMARY KEY,
    s_name VARCHAR2(10) 
        CONSTRAINT s_name_nn NOT NULL,
    s_gender CHAR(1) 
        CONSTRAINT s_gender_ck CHECK(s_gender IN('M','F')),
    s_score CHAR(1) 
        CONSTRAINT s_score_grade_ck CHECK(s_score IN('A','B','C','D','F')) 
        CONSTRAINT s_score_grade_nn NOT NULL,
    s_phone CHAR(13) 
        CONSTRAINT s_phone_ck CHECK(REGEXP_LIKE(s_phone, '010-\d{4}-\d{4}'))
        CONSTRAINT s_phone_nn NOT NULL
        CONSTRAINT s_phone_uk UNIQUE
);

DESC students;
SELECT * FROM user_constraints WHERE table_name = 'STUDENTS';

/*
    # DEFAULT 제약 조건
        - 컬럼에 아무 값도 입력하지 않았을 때 사용 할 기본값을 설정해둔다
*/
ALTER TABLE students ADD (
    s_kor NUMBER(3) DEFAULT 0
);

ALTER TABLE students MODIFY (
    s_kor NUMBER(3) DEFAULT 3
);

-- # 테이블 컬럼 데이터 딕셔너리 뷰에서 data_default를 확인할 수 있다
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENTS';

/*
    # table-level에서 제약조건 정의하기 
        - 컬럼을 모두 정의한 뒤에 따로 제약조건 정의하기
        - DEFAULT와 NOT NULL은 TABLE LABEL에서 정의할 수 없다
*/
CREATE TABLE STUDENTS2 (
    s_num NUMBER(4),
    s_name VARCHAR2(10) DEFAULT '김철수' CONSTRAINT stu2_name_nn NOT NULL,
    s_gender CHAR(1),
    s_score CHAR(1),
    s_phone CHAR(13),
    CONSTRAINT stu2_id_pk PRIMARY KEY (s_num),
    -- CONSTRAINT STU2_ID_PK PRIMARY KEY(s_num, s_phone), -- 테이블 라벨을 이용하면 보갑 기본키를 지정할 수 있다
    CONSTRAINT STU2_gender_chk CHECK(s_gender IN('M','F')),
    CONSTRAINT STU2_grade_chk CHECK(s_score IN('A','B','C','D','F'))
);

DESC students2;
ALTER TABLE students2 DROP COLUMN S_PHONE;

/*
    # Foreign Key 설정하기
        - 제약조건을 설정할 때 어떤 제약조건을 참조할지 함께 설정해야 한다
*/

SELECT * FROM locations;
SELECT * FROM user_constraints WHERE table_name = 'LOCATIONS'; -- loc_id_pk

-- # 컬럼 레벨로 FK 설정하기

-- 다른 테이블의 pk혹은 UNIQUE로 설정된 컬럼만 외래키로 참조할 수 있다
ALTER TABLE students ADD (
    location_id NUMBER(4) 
        CONSTRAINT STU_LOC_FK 
            REFERENCES locations(location_id)
);

-- PK 혹은 UNIQUE가 아닌 컬럼은 외래키로 참조할 수 없다 (오류)
ALTER TABLE students ADD (
    stu_parent VARCHAR2(25) 
        CONSTRAINT stu_pa_FK
            REFERENCES employees(first_name, last_name)
);

-- # 테이블 레벨로 FK설정하기
-- - FK역할을 하는 컬럼은 FOREIGN KEY로 설정하고, 참조하는 테이블 및 컬럼은 REFERENCES로 설정한다
ALTER TABLE students ADD (
    department_id NUMBER(4), 
    CONSTRAINT STU_DEPT_FK FOREIGN KEY(department_id) REFERENCES departments (department_id)
);

INSERT INTO students VALUES(1, '홍길동', 'M', 'B', '010-1234-1264', 90, 2500, 10);

SELECT * FROM students 
    INNER JOIN locations USING (location_id)
    INNER JOIN departments USING (department_id);

DESC students2;
ALTER TABLE students2 ADD (
    stu_phone CHAR(13)
);

-- # 이미 존재하는 컬럼에 제약조건 추가하기
ALTER TABLE students2 ADD CONSTRAINT stu2_ph_uk UNIQUE(stu_phone);

SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';

-- # 컬럼에 이미 존재하는 제약조건 제거하기
ALTER TABLE students2 DROP CONSTRAINT stu2_ph_uk;

-- # NOT NULL, DEFAULT는 ADD CONSTRAINT대신 MODIFY를 이용해 컬럼을 수정한다
ALTER TABLE students2 MODIFY stu_phone CONSTRAINT stu2_ph_nn NOT NULL;
ALTER TABLE students2 MODIFY stu_phone DEFAULT '000-0000-0000';

-- # 확인용
SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENTS2';

/*
    # ON DELETE 절
        - FK가 참조하고 있는 PK가 삭제되었을 때 해당 FK를 어떻게 변경할지 설정한다
        - CASCADE : 참조하던 PK가 삭제되면 FK의 행을 함께 삭제한다
            ex : departments에서 50번 부서를 삭제하면 employees의 모든 50번 부서에 속한 사원이 삭제된다
        - SET NULL : 참조하던 PK가 삭제되면 FK의 값을 NULL로 변환한다
            ex: departments에서 50번 부서를 삭제하면 employees의 모든 50번 부서에 속한 사원의
                department_id를 null로 변환한다
        - NO ACTION : 아무런 조치를 취하지 않는다
        - RESTRICT : ON DELETE를 설정하지 않은 경우 자식이 있는 부모키의 삭제x
*/
CREATE TABLE empp AS SELECT * FROM employees;
DROP TABLE empp PURGE;
CREATE TABLE depp AS SELECT * FROM departments;
DROP TABLE depp PURGE;

SELECT * FROM user_constraints WHERE table_name = 'EMPP';
SELECT * FROM user_constraints WHERE table_name = 'DEPP';
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';
SELECT * FROM user_constraints WHERE table_name = 'departments';

-- 연습문제02: empp 테이블과 depp테이블의 기본키/외래키 제약 조건을 설정해보세요
SELECT * FROM user_constraints WHERE table_name = 'EMPP';

ALTER TABLE empp 
RENAME CONSTRAINT SYS_c009234 TO empp_last_name;

ALTER TABLE empp ADD CONSTRAINT empp_last_name UNIQUE(last_name);

ALTER TABLE empp ADD CONSTRAINT empp_email_uk UNIQUE(email);
ALTER TABLE empp ADD CONSTRAINT empp_email_fk REFERENCES employees(email);
ALTER TABLE empp ADD CONSTRAINT empp_hire_date_fk REFERENCES employees(hire_date);
ALTER TABLE empp ADD CONSTRAINT empp_job_id_fk REFERENCES employees(job_id);

SELECT * FROM user_constraints WHERE table_name = 'DEPP';
ALTER TABLE depp ADD CONSTRAINT depp_department_name_uk UNIQUE(department_name);

-- --------------------------------------------------------------------------------------------
ALTER TABLE empp ADD CONSTRAINT empp_emp_id_pk PRIMARY KEY(employee_id);
ALTER TABLE depp ADD CONSTRAINT depp_id_pk PRIMARY KEY(department_id);

ALTER TABLE empp ADD (
    CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) REFERENCES depp(department_id),
    CONSTRAINT empp_manager_fk FOREIGN KEY(manager_id) REFERENCES empp(employee_id)
    -- SELF REFERENCES : 내 테이블의 employee_id에 포함된 값만 manager_id 컬럼에 추가할 수 있다
);

-- # ON DELETE CASCADE 테스트

-- 1. 외래키를 ON DELETE로 설정
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) 
        REFERENCES depp(department_id) ON DELETE CASCADE;

-- 2. 부모키를 삭제(30번 부서를 삭제)
DELETE FROM depp WHERE department_id = 30;

-- # CASCADE는 부모키를 삭제하면 관련 FK행이 모두 함께 삭제된다

-- 1. 외래키를 ON DELETE SET NULL로 설정
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) 
        REFERENCES depp(department_id) ON DELETE SET NULL;

-- 2. SET NULL인 상태로 100번 부서를 삭제
DELETE FROM depp WHERE department_id = 100;

SELECT * FROM empp ORDER BY department_id DESC;

-- # ON DELETE 미설정 테스트

-- 1. 외래키의 ON DELETE를 기본값으로 설정
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) 
        REFERENCES depp(department_id);

-- 2. 기본값인 상태로 50번 부서를 삭제
DELETE FROM depp WHERE department_id = 50;

SELECT * FROM empp ORDER BY department_id DESC;
--# ON DELETE절이 설정되어 있지 않은 경우에는 자식 레코드가 있는 부모키를 삭제할 수 없다







