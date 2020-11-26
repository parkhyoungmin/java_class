-- 12.������ �߰�,����,����.sql

/*
    # INSERT : ���̺� ���ο� ������ �߰�(����)
    
        INSERT INTO ���̺��(�÷���, ..) VALUES(��, ..)
*/
DESC coffees;

-- # ���� �⺻���� ������ �߰�
INSERT INTO coffees(cfid, cname, cprice) VALUES(1, '���̽��Ƹ޸�ī��', 2000);
INSERT INTO coffees(cname, cfid, cprice) VALUES('�߰ſ�Ƹ޸�ī��', 2, 2000);

-- # �Ϻ� �÷����� ������ �߰�
INSERT INTO coffees(cname, cprice) VALUES('���̽� ī���', 2500);
INSERT INTO coffees(cprice, cfid) VALUES(2500, 4);

-- # �÷��� �����ϸ鼭 ������ �߰� (��� �÷��� ������� ��� ���� �־�� ��)
INSERT INTO coffees VALUES(5, '���̽� ī���ī', 3000);

SELECT * FROM coffees;

-- # ���������� ������ �����ϱ�
INSERT INTO coffees SELECT * FROM coffees;

SELECT * FROM coffees;

/*
    # UPDATE : ���̺��� �����͸� ����
        
        - UPDATE ���̺�� SET �÷��� - ��, ... WHERE ������ ���� ����;
        - UPDATE���� ������ �Է����� ������ ��� ���� �����ȴ�
        - ������ �����ϴ� ��� ���� �����Ѵ�
        - �ϳ��� ���� ������ �� �ִ� �⺻Ű�� �Բ� �̿�Ǵ� ��찡 ��κ��̴�
*/
SELECT * FROM coffees;

UPDATE coffees SET cprice = cprice + 200 WHERE cfid = 2;

-- ��������01: employees ���̺��� ������ �����ϴ� �������� �̿��Ͽ� emp ���̺��� �����غ�����
CREATE TABLE emp AS SELECT * FROM employees WHERE 1 = 0;

SELECT
    *
FROM emp;
-- ��������02: emp���̺� employees�� ��� ����� �� Ȧ�� ����� ��������鸸 �߰��غ�����
INSERT INTO 
    emp 
SELECT
    *
FROM 
    employees 
WHERE 
    MOD(employee_id, 2) = 1;

-- ��������03: emp���̺� ��� ������� JoB_ID�� MAN�� ���Ե� ������� ������ 40%�谨 �غ�����
UPDATE 
    emp 
SET 
    salary = salary * 0.4 
WHERE 
    job_id Like '%MAN%';

/*
    # DELETE
    
        - DELETE FROM ���̺�� WHERE ����;
        - ������ ������ ��� ���� �����
        - ���ǿ� �´� ��� ���� �����
*/
commit;

SELECT * FROM coffees;
DELETE FROM coffees WHERE cname LIKE '%�Ƹ޸�ī��%';
rollback;



