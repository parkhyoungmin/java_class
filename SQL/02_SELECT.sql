-- 02_SELECT.sql

/*
     # SELECT �÷��� FROM ���̺��;
    - �����͸� ��ȸ�ϴ� ������
    - �÷��� *�� ���� ���� ��� �÷��� ���Ѵ�
*/

-- tab���̺��� ��� �÷�(�Ӽ�, �ʵ�, ��)�� ��ȸ�Ѵ�
SELECT * FROM tab; 

-- ���� ���̺��� ��� �÷��� ��ȸ�Ѵ�
SELECT * FROM employees; 

-- �÷����� ������ �ش� �÷��� �����͸� ��ȸ�Ѵ�
SELECT last_name, phone_number, hire_date FROM employees;

-- ������ ���̺� ����
/*
    COUNTRIES : ���� ������ ������ ���̺�
    EMPLOYEES : ��� ������ ������ ���̺�
    DEPARTMENTS : �μ� ������ ������ ���̺�
    JOBS : ���� ������ ������ ���̺�
    LOCATION : ���� ������ ���ھ� ���̺�
    REGIONS : ���� ������ ������ ���̺�
*/

-- ���̺��� �Ӽ� ���� ����
DESC employees;

-- ����Ŭ�� ������ Ÿ��
/*
    # NUMBER(�ڸ���), NUMBER(��ü �ڸ���, �Ҽ��� �ڸ���)
    - ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
    - NUMBER(6) : 6�ڸ� ������ ������ �� �ִ� �÷��� �ȴ�
    - NUMBER(6,3) : 6�ڸ� ������ 3�ڸ� �Ҽ����� ������ �� �ִ� �÷��� �ȴ�
    # CHAR(�ڸ���)
    - ���� ���� ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
    - ������ ���̺��� ���� ���� �����Ͱ� ��������
    ���������� ������ ���̸� �����Ѵ�
    - CHAR(10)�� ������ �÷��� 2���ڰ� �������� 10����Ʈ�� �����Ѵ�
    # VARCHAR2(n)
    - ���� ���� ���� �����͸� ������ �� ����ϴ� �÷�Ÿ��
    - ����� �������� ũ�⿡ ���� �˸��� ������ ����Ѵ�
    - ���� ������ ���� ���� �� �ִ�
    - VARCHAR2(10)���� ������ �÷��� 2���ڰ� ������ 2����Ʈ�� �����Ѵ�
    # DATE
    - ��¥ �� �ð��� �����ϴ� �÷� Ÿ��
    - ����/��/��/��/��/��/��/���� ���� �����Ѵ�
*/

-- ��������01 : ��� ����� ���/�̸�/����/�μ���ȣ�� ��ȸ�غ�����
SELECT * from employees;
SELECT employee_id,first_name, last_name, salary, department_id FROM employees;

-- �� �÷���, ���̺��, Ű����� ��ҹ��ڸ� �������� �ʴ´�

-- ��������ڷ� ���� �� ����ϱ�
SELECT last_name, salary FROM employees;
SELECT last_name, salary + 500 FROM employees;
SELECT last_name, salary * 2 FROM employees;
SELECT last_name, salary / 10 FROM employees;

-- ���޿� ���ʽ� �����غ���
-- �÷����� ���� ������ ������� �ܿ� AS�� �̿��� �÷����� ������ �� �ִ�
-- null�� �������� �ʴ� ���̱� ������ ������꿡 ���ԵǸ� ������ null�� �ȴ�
SELECT last_name, salary * commission_pct as ���ʽ� FROM employees;
SELECT last_name, salary + salary * commission_pct as �ѱݾ� FROM employees;

-- NVL(�÷���, ��ü��) �Լ� : �ش� �÷����� NULL���� �������� ��ü���� ����Ѵ�
SELECT 
    last_name, salary + (NVL(commission_pct, 0) + 1) AS total_salary
FROM 
    employees;

-- "�÷���"�� �̿��ϸ� �÷����� ��ҹ��ڸ� ������ �� �ִ�
SELECT last_name as "LAST_NAME" FROM employees;
SELECT last_name as "LASTNAME" FROM employees;

-- ��������02 : ��� ������� ���/�̸�/������ ����غ����� (����� salary�� ����)
DESC employees;
SELECT
    employee_id, last_name, first_name, salary * 12 as ����
FROM employees;

-- SELECT DISTINCT : �ߺ��Ǵ� ����� �־ �� ���� ��ȸ�ȴ�

-- ��� �������� ��å�� �ѹ����� �� �� �ִ�
SELECT DISTINCT job_id FROM employees;
-- ��� �������� ���� �μ���ȣ�� �ѹ����� �� �� �ִ�
SELECT DISTINCT department_id FROM employees;

-- �Ŵ��� ������ �ϰ� �ִ� ������� ����� �ѹ����� ��ȸ�� �� �ִ�
SELECT DISTINCT manager_id FROM employees;











