-- 14_��������

/*
    # ������ ���Ἲ
        - �����Ͱ� �׻� �����ؾ� �ϴ� ����
        - �����Ͱ� ��Ȯ�� + �ϰ����� �����ϱ� ���� �ʿ��� ��
        
        - ��ü ���Ἲ
            �ϳ��� ���� ������ �� �ִ� �÷��� �ݵ�� �����ؾ� �Ѵ�
            ���̺��� �ݵ�� PK(Primary Key)�� �����ؾ� �Ѵ�
        - ���� ���Ἲ
            ���� ���迡 �ִ� �����Ͱ� �׻� �ϰ��� ���� ������ �Ѵ�
            �ܷ�Ű�� �ݵ�� �����ϴ� ���̺� �����ϴ� ���� ����ؾ� �Ѵ�
        - ������ ���Ἲ
            �ش� �÷��� ���� Ÿ���� �����ؾ� �Ѵ�
    # ������ ���Ἲ ���� ����
        - ���̺� ���Ἲ�� ��ġ�� �������� �����Ͱ� �ԷµǴ°��� �����ϱ� ���� ��Ģ
        - NOT NULL : �ش� �÷��� NULL�� ������� �ʴ� ��Ģ
        - UNIQUE : �ش� �÷��� �ߺ����� ������� �ʴ� ��Ģ. �׻� ������ ���� ������ �Ѵ�.
        - PRIMARY KEY : NOT NULL + UNIQUE. �ش� �÷��� �⺻Ű�� �ȴ�
        - FOREIGN KEY : �ܷ�Ű�� ������ �÷��� �����ϴ� �÷��� �����ϴ� ���� �߰��� �� �ִ�
        - CHECK : �������� ������ ������ ���� �����Ͽ� ������ ���Ἲ�� ������ �� �ִ�
*/

-- # �������� ������ ��ųʸ� �並 ���� ���̺��� ���������� Ȯ���� �� �ִ�
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';
SELECT * FROM all_constraints WHERE owner = 'HR' AND table_name = 'DEPARTMENTS';

/*
    # ���� ���� ���̺� ���� ���
    
        - CONSTRAINT_TYPE
            P : Primary Key
            R : Foreign Key
            C : Check or Not Null
            U : UNIQUE
        - R_�� ���� �÷����� �ش� �ܷ�Ű�� �����ϴ� �÷�(PK, UNIQUE)�� ������ ��� �ִ�
            R_OWNER : �����ϴ� ���̺��� ������
            R_CONSTRAINT_NAME : �ܷ�Ű�� �����ϴ� �÷��� ��������
*/

-- # ���̺� ������ �������� �����ϱ�
CREATE TABLE FRUITS (
    fid number(10) primary key,
    fname VARCHAR2(30) not null
);

DESC fruits;
SELECT
    *
FROM user_constraints WHERE table_name = 'FRUITS';

-- # �÷� �߰� �� �������� �����ϱ�
ALTER TABLE FRUITS ADD (
    color varchar2(10) not null
);

/*
     �� ���������� ������ �� �������Ǹ��� �������� ������ ����Ŭ�� �������Ǹ��� �ڵ����� �ο��Ѵ�
     ����Ŭ�� �ڵ����� �ο��� �������Ǹ����δ� � ���������� �����ߴ��� �˱� ����� ������
     �������Ǹ��� �ݵ�� �����ϴ� ���� ����

    # �������� ��� ��Ģ : [���̺��]_[�÷���]_[�������� ����]
        ex : EMP_DEPT_FK
             DEPT_ID_PK
             DEPT_LOC_FK
             DEPT_NAME-NN
*/

-- # �������Ǹ�� �Բ� �������� �����ϴ� ���
ALTER TABLE fruits ADD (
    sweet number(4, 2) CONSTRAINT fruit_sweet_nn not null,
    fsize number(2) CONSTRAINT fruit_size_stan CHECK(fsize BETWEEN 10 AND 20)
);

DESC fruits;
SELECT
    *
FROM user_constraints WHERE table_name = 'FRUITS';

INSERT INTO fruits VALUES(1, '��', 'brown', 8.88, -5);

/*
    ��������01 : �л� ���̺��� �����ϵ� ������ ���� ���������� ���Ѽ� ��������
    
        �л���ȣ 4�ڸ� ����
        �л��̸� 10���� ��������, NOT NULL 
        �л����� 1���� ��������, �����δ� M �Ǵ� F�� ���
        �л����� 1���� ��������, �����δ� A,B,C,D,F�� ���, NOT NULL 
        �ڵ�����ȣ 13���� ��������, ����Ŭ ����ǥ���� �Լ��� �̿��� �ڵ��� ���Խ��� �����ϴ� ��츸 ���, NOT NULL
        
        �� ��� ���� ������ �ڵ� ������ ���� ���Ǹ��� �ƴϾ�� ��
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
    (0001, '��ö��', 'M', 'B', '010-1234-5678');
    
INSERT INTO 
    students(s_num, s_name, s_gender, s_score, s_phone) 
VALUES 
    (0002, '�迵��', 'F', 'A', '010-9012-3456');

ROLLBACK;

SELECT * FROM STUDENTS;
DROP TABLE STUDENTS PURGE;

-- �ϳ��� �÷��� �������� ������ �߰��� ��
ALTER TABLE fruits ADD (
    fsize NUMBER(2)
        CONSTRAINT fruit_size_stan CHECK (fsize BETWEEN 10 AND 20)
        CONSTRAINT fruit_size_nn NOT NULL
);

-- ---------------------------------------------------------------------------------
/*
    ��������01 : �л� ���̺��� �����ϵ� ������ ���� ���������� ���Ѽ� ��������
    
        �л���ȣ 4�ڸ� ����
        �л��̸� 10���� ��������, NOT NULL 
        �л����� 1���� ��������, �����δ� M �Ǵ� F�� ���
        �л����� 1���� ��������, �����δ� A,B,C,D,F�� ���, NOT NULL 
        �ڵ�����ȣ 13���� ��������, ����Ŭ ����ǥ���� �Լ��� �̿��� �ڵ��� ���Խ��� �����ϴ� ��츸 ���, NOT NULL
        
        �� ��� ���� ������ �ڵ� ������ ���� ���Ǹ��� �ƴϾ�� ��
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
    # DEFAULT ���� ����
        - �÷��� �ƹ� ���� �Է����� �ʾ��� �� ��� �� �⺻���� �����صд�
*/
ALTER TABLE students ADD (
    s_kor NUMBER(3) DEFAULT 0
);

ALTER TABLE students MODIFY (
    s_kor NUMBER(3) DEFAULT 3
);

-- # ���̺� �÷� ������ ��ųʸ� �信�� data_default�� Ȯ���� �� �ִ�
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENTS';

/*
    # table-level���� �������� �����ϱ� 
        - �÷��� ��� ������ �ڿ� ���� �������� �����ϱ�
        - DEFAULT�� NOT NULL�� TABLE LABEL���� ������ �� ����
*/
CREATE TABLE STUDENTS2 (
    s_num NUMBER(4),
    s_name VARCHAR2(10) DEFAULT '��ö��' CONSTRAINT stu2_name_nn NOT NULL,
    s_gender CHAR(1),
    s_score CHAR(1),
    s_phone CHAR(13),
    CONSTRAINT stu2_id_pk PRIMARY KEY (s_num),
    -- CONSTRAINT STU2_ID_PK PRIMARY KEY(s_num, s_phone), -- ���̺� ���� �̿��ϸ� ���� �⺻Ű�� ������ �� �ִ�
    CONSTRAINT STU2_gender_chk CHECK(s_gender IN('M','F')),
    CONSTRAINT STU2_grade_chk CHECK(s_score IN('A','B','C','D','F'))
);

DESC students2;
ALTER TABLE students2 DROP COLUMN S_PHONE;

/*
    # Foreign Key �����ϱ�
        - ���������� ������ �� � ���������� �������� �Բ� �����ؾ� �Ѵ�
*/

SELECT * FROM locations;
SELECT * FROM user_constraints WHERE table_name = 'LOCATIONS'; -- loc_id_pk

-- # �÷� ������ FK �����ϱ�

-- �ٸ� ���̺��� pkȤ�� UNIQUE�� ������ �÷��� �ܷ�Ű�� ������ �� �ִ�
ALTER TABLE students ADD (
    location_id NUMBER(4) 
        CONSTRAINT STU_LOC_FK 
            REFERENCES locations(location_id)
);

-- PK Ȥ�� UNIQUE�� �ƴ� �÷��� �ܷ�Ű�� ������ �� ���� (����)
ALTER TABLE students ADD (
    stu_parent VARCHAR2(25) 
        CONSTRAINT stu_pa_FK
            REFERENCES employees(first_name, last_name)
);

-- # ���̺� ������ FK�����ϱ�
-- - FK������ �ϴ� �÷��� FOREIGN KEY�� �����ϰ�, �����ϴ� ���̺� �� �÷��� REFERENCES�� �����Ѵ�
ALTER TABLE students ADD (
    department_id NUMBER(4), 
    CONSTRAINT STU_DEPT_FK FOREIGN KEY(department_id) REFERENCES departments (department_id)
);

INSERT INTO students VALUES(1, 'ȫ�浿', 'M', 'B', '010-1234-1264', 90, 2500, 10);

SELECT * FROM students 
    INNER JOIN locations USING (location_id)
    INNER JOIN departments USING (department_id);

DESC students2;
ALTER TABLE students2 ADD (
    stu_phone CHAR(13)
);

-- # �̹� �����ϴ� �÷��� �������� �߰��ϱ�
ALTER TABLE students2 ADD CONSTRAINT stu2_ph_uk UNIQUE(stu_phone);

SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';

-- # �÷��� �̹� �����ϴ� �������� �����ϱ�
ALTER TABLE students2 DROP CONSTRAINT stu2_ph_uk;

-- # NOT NULL, DEFAULT�� ADD CONSTRAINT��� MODIFY�� �̿��� �÷��� �����Ѵ�
ALTER TABLE students2 MODIFY stu_phone CONSTRAINT stu2_ph_nn NOT NULL;
ALTER TABLE students2 MODIFY stu_phone DEFAULT '000-0000-0000';

-- # Ȯ�ο�
SELECT * FROM user_constraints WHERE table_name = 'STUDENTS2';
SELECT * FROM user_tab_columns WHERE table_name = 'STUDENTS2';

/*
    # ON DELETE ��
        - FK�� �����ϰ� �ִ� PK�� �����Ǿ��� �� �ش� FK�� ��� �������� �����Ѵ�
        - CASCADE : �����ϴ� PK�� �����Ǹ� FK�� ���� �Բ� �����Ѵ�
            ex : departments���� 50�� �μ��� �����ϸ� employees�� ��� 50�� �μ��� ���� ����� �����ȴ�
        - SET NULL : �����ϴ� PK�� �����Ǹ� FK�� ���� NULL�� ��ȯ�Ѵ�
            ex: departments���� 50�� �μ��� �����ϸ� employees�� ��� 50�� �μ��� ���� �����
                department_id�� null�� ��ȯ�Ѵ�
        - NO ACTION : �ƹ��� ��ġ�� ������ �ʴ´�
        - RESTRICT : ON DELETE�� �������� ���� ��� �ڽ��� �ִ� �θ�Ű�� ����x
*/
CREATE TABLE empp AS SELECT * FROM employees;
DROP TABLE empp PURGE;
CREATE TABLE depp AS SELECT * FROM departments;
DROP TABLE depp PURGE;

SELECT * FROM user_constraints WHERE table_name = 'EMPP';
SELECT * FROM user_constraints WHERE table_name = 'DEPP';
SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';
SELECT * FROM user_constraints WHERE table_name = 'departments';

-- ��������02: empp ���̺�� depp���̺��� �⺻Ű/�ܷ�Ű ���� ������ �����غ�����
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
    -- SELF REFERENCES : �� ���̺��� employee_id�� ���Ե� ���� manager_id �÷��� �߰��� �� �ִ�
);

-- # ON DELETE CASCADE �׽�Ʈ

-- 1. �ܷ�Ű�� ON DELETE�� ����
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) 
        REFERENCES depp(department_id) ON DELETE CASCADE;

-- 2. �θ�Ű�� ����(30�� �μ��� ����)
DELETE FROM depp WHERE department_id = 30;

-- # CASCADE�� �θ�Ű�� �����ϸ� ���� FK���� ��� �Բ� �����ȴ�

-- 1. �ܷ�Ű�� ON DELETE SET NULL�� ����
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) 
        REFERENCES depp(department_id) ON DELETE SET NULL;

-- 2. SET NULL�� ���·� 100�� �μ��� ����
DELETE FROM depp WHERE department_id = 100;

SELECT * FROM empp ORDER BY department_id DESC;

-- # ON DELETE �̼��� �׽�Ʈ

-- 1. �ܷ�Ű�� ON DELETE�� �⺻������ ����
ALTER TABLE empp DROP CONSTRAINT empp_dept_fk;
ALTER TABLE empp 
    ADD CONSTRAINT empp_dept_fk FOREIGN KEY(department_id) 
        REFERENCES depp(department_id);

-- 2. �⺻���� ���·� 50�� �μ��� ����
DELETE FROM depp WHERE department_id = 50;

SELECT * FROM empp ORDER BY department_id DESC;
--# ON DELETE���� �����Ǿ� ���� ���� ��쿡�� �ڽ� ���ڵ尡 �ִ� �θ�Ű�� ������ �� ����







