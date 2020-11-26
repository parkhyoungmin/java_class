-- 11_���̺� ����.sql

/*
    # DML (Data Manipulation Language, ������ ���۾�)
        - ���̺� ���� �����͸� �˻�/�߰�/����/�����ϴ� ��ɾ�
        - SELECT : �˻�
        - INSERT : ����
        - UPDATE : ����
        - DELETE : ����
        
    # DDL (Data Definition Language, ������ ���Ǿ�)
        - ���̺� ��(������, �ε���, �� ...)�� ������ �����ϴµ� ����ϴ� ��ɾ�
        - CREATR : ����
        - DROP : ����
        - ALTER : ����
        - TRUNCATE : ���� ����
        
    # DCL (Date Control Language, ������ ���� ��ɾ�)
        - ������� ������ �����ϴµ� ����ϴ� ��ɾ�
        - GRANT : ����ڿ��� ������ �ο�
        - REVOKE : ������� ������ ȸ��
*/

/*
    # ���̺� ����
        CREATE TABLE ���̺�� (�÷��̸�1, �÷�Ÿ��1, �÷��̸�2, �÷�Ÿ��2, .....);
*/

CREATE TABLE coffees (
    CID NUMBER(4),
    CNAME VARCHAR2(30),
    CPRICE NUMBER(6)
);

DESC coffees;

-- ������ �����ϴ� ���̺��� �����ϸ鼭 �����
CREATE TABLE employees2 AS SELECT * FROM employees;
CREATE TABLE employees3 AS (SELECT last_name AS �̸�, salary As ���� FROM employees);

-- # ���̺� �����ϱ�
SELECT * FROM tab;
drop table employees2;

-- # ������ ���̺� �˻�
show recyclebin;
SELECT * FROM recyclebin;

-- # �������� �����ϱ�
FLASHBACK TABLE coffees TO BEFORE DROP;

-- # ������ ����
PURGE recyclebin;

-- # ������ ��ġ�� �ʰ� �ٷ� ���̺� ����
DROP TABLE coffees PURGE;

-- ��������01: 50�� �μ� �����θ� ������ ���̺��� �ϳ� �����غ�����
CREATE TABLE employees50 AS SELECT * FROM employees WHERE department_id = 50;
SELECT * from employees50;
DROP TABLE employees50 PURGE;

-- # ���̺��� ������ �����ϱ� (�Ϻη� ���� �ȵǴ� ������ �ְ� ���̺� ����)
CREATE TABLE employeee AS SELECT * FROM employees WHERE 1= 0;

-- # ���̺� ���� ���� ��ɾ��
CREATE TABLE coffees (
    CID NUMBER(4),
    CNAME VARCHAR2(30),
    CPRICE NUMBER(6)
);

-- # ALTER TABLE ���̺�� ADD (�÷���1 �÷�Ÿ��1, �÷���2 �÷�Ÿ��2, ...)
ALTER TABLE coffees ADD (
    location_id NUMBER(4),
    acidity NUMBER(4, 2)
);
desc coffees;
SELECT * FROM coffees;

-- # ALTER TABLE ���̺�� MODIFY (�÷��� �÷�Ÿ��, ...)
--  - �÷��� ������ ���� ������ Ÿ���̳� ũ�� ���� ������ �� �ִ�
--  - �÷����� ������ �� ����
ALTER TABLE coffees MODIFY (
    cid number(3),
    cname VARCHAR2(50)
);
DESC coffees;

-- # ALTER TABLE ���̺�� DROP COLUMN �÷���;
ALTER TABLE coffees DROP COLUMN acidity;
DESC coffees;

-- # ALTER TABLE ���̺�� SET UNUSED(�÷���) : ������ �غ� ��Ű�� (SET UNUSED)
--  - �ش� �÷��� �����ϱ� ���� ������� ���ϴ� ���·� �����Ѵ�
--  - �������� ������ ���߿� �����Ҷ� ����Ѵ�
--  - ���̺� ����� ���� ���� �� ������ �ð��� �����ϱ� ���� �����Ѵ�

ALTER TABLE coffees SET UNUSED(location_id);
DESC coffees;

-- ������ �ð��뿡 ������ �����Ѵ�
ALTER TABLE coffees DROP UNUSED COLUMNS;

-- # ���̺�� �����ϱ�
RENAME coffees TO coffee_shop;
RENAME coffee_shop TO coffees;
SELECT * FROM tab;

-- # �÷��� �����ϱ�
ALTER TABLE coffee_shop RENAME COLUMN cid TO cfid;
DESC coffee_shop;

/*
    # ������ ��ųʸ�
        - �츮�� ���̺��� �߰��ϸ� DB�� �����ϴ� ���̺��� ������ DBMS�� �˾Ƽ� �����Ѵ�
        - ��ó�� ����ڰ� ���� �����ϴ� ���� �ƴ� �����͵��� ������ ��ųʸ���� �θ���

    # ������ ��ųʸ� ��
        - ������ ��ųʸ��� ����ڰ� ���� ���ϵ��� ��ȯ�Ͽ� �����ϴ� ��(View)
*/

-- # ���̺� ������ ��ųʸ� ��
SELECT * FROM tab;
SELECT * FROM tabs;
SELECT * FROM user_tables; -- user_ : ���� USER�� ������ �ִ� ������ �����ִ� ������ ��ųʸ� ��
SELECT * FROM all_tables; -- all_ : ��� USER�� ������ �ִ� ������ �����ִ� ������ ��ųʸ� ��

-- # ��������(constraints) ������ ��ųʸ� ��
SELECT * FROM user_constraints;
SELECT * FROM all_constraints;

SHOW USER;











