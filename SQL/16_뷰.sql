-- 16_��.sql

/*
    # ��(View)
        - �������� �⺻ ���̺���� �̿��� ������ ������ ������ ���̺�
        - �⺻ ���̺��� �Ļ��� ��ü
        - ����ڴ� �־��� �並 ���� �⺻ ���̺��� ���������� ����ϰ� �ȴ�
        
        CREATE [OR VIEW] [FORCE | NOFORCE] VIEW ���̸� AS ��������[(��Ī, ��Ī, ..)]
                    [WITH CHECK OPTION]
                    [WITH READ ONLY];
        - CREATE OR REPLACE : �̹� �����ϴ� VIEW�̸��� ����ϸ� �ش� VIEW�� �����Ѵ�
        - FORCE : �⺻ ���̺��� ���� ���ο� ������� �並 �����Ѵ�
        - WITH CHECK OPTION : �ش� �並 ���� �� �� �ִ� ���� �������� UPDATE�� INSERT�� ����������
        - WITH READ ONLY : �ش� ��� SELECT�� �����ϸ� INSERT/UPDATE/DELETE�� �� �� ���� �ȴ�
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

-- ��������01: �����ȣ/����̸�/�μ���ȣ/�Ŵ�����ȣ/�Ŵ����̸��� ���� Ȯ���� �� �ִ� 
-- EMP_MGR_VIEW�� �����غ�����
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


-- force : �⺻���̺��� �������� �ʴ��� ������ �並 �����Ѵ�
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

-- ���̺��� ���߿� �����Ǹ� �۵��� �並 �̸� �ۼ��� ���� �� ����Ѵ� 
CREATE TABLE empployeees AS SELECT * FROM employees;

/*
    # �信 ���� ������ ����Ǵ� ����
        1. ����ڰ� �信 ���� �������� �����Ѵ� (SELECT, INSERT, UPDATE, DELETE)
        2. ������ ���ɴ�
        3. ����ڰ� �Է��� �������� �⺻ ���̺� ���� ���������� ��ȯ�Ѵ�
        4. ��ȯ�� �⺻ ���̺� ���� �������� �̿��� �����͸� �˻��Ѵ�
        5. �˻��� ����� ����Ѵ�
        
    # �ϳ��� ���̺� �̿��ϴ� �並 �ܼ� ���� �θ���,
    ������ ���� �� �� �̻��� ���̺��� �̿��ϴ� �並 ���� ���� �θ���.
*/

CREATE TABLE emp3 AS SELECT * FROM employees;

/*
    # WITH CHECK OPTION
        - �� �並 ���� �� ���ǿ� ���� �÷��� �並 ���ؼ��� ������ �� ������ �Ѵ�
        - �並 ������ �� �߻��� �� �ִ� ȥ���� �ּ�ȭ�Ѵ�
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

-- VIEW�� ���� �۾��ϴ� �� �μ� �̵��� �ʿ��� ��Ȳ�� �߻��ߴٰ� ����
SELECT * FROM chk_view30 WHERE salary < 3000; 
UPDATE chk_view30 SET department_id = 20 WHERE salary < 3000;

/*
    # WITH READ ONLY
        - WITH CHECK OPTION�� ���� �������� ����� �÷��� ���游 ������
        WITH READ ONLY�� ��� �÷��� ���� ������ ���´�
        - �並 ���� �⺻ ���̺��� ���� ������ �� ������ ���´�
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

-- chk_view30�信 DML�� �̿��Ͽ� �並 �����ϸ� 
-- �����δ� �⺻ ���̺� ��� ���� �ݿ��ȴ� 
UPDATE chk_view30 SET salary = 20000;

-- �並 ���� �߰��� ����������, 
-- �ش� �丸���δ� emp3���̺��� ��� NOT NULL�÷��� ä�� �� ��� INSERT�� �Ұ���
-- chk_view30�� ���ؼ��� 30�� �μ��� ����� INSERT�� �����ϴ� (�� ������ �μ��� 30�� �̾����Ƿ�)
INSERT INTO chk_view30 VALUES(1, '�浿', 'ȫ', 500, 'GILDONGHONG', sysdate, '���', 30); 
SELECT * FROM emp3 WHERE department_id = 30;

-- ��� �⺻ ���̺��� ������ Ȯ���ϴ� ���̱� ������ �ٸ� �信�� ��ȯ�� ���뵵 �翬�� ����ȴ� 
SELECT * FROM r_only_view30;
UPDATE r_only_view30 SET salary = 2000;











