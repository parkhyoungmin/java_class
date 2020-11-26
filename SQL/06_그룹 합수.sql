-- 06_�׷� �Լ�.sql

-- # �׷� �ռ�
/*
    - ���� ���� ���� �����ϴ� �Լ���
    - ����, ����, ���, �ִ�, �ּ�, ...
*/
-- SUM() : �ش� �÷��� ��� ���� ������ ���Ѵ�
SELECT SUM(salary) AS �ѿ��� FROM employees;
SELECT SUM(commission_pct) FROM employees;

-- MAX(COL) : �ش� �÷��� ��� ���� �� �ִ� ���� ���Ѵ�
-- MIN(COL) : �ش� �÷��� ��� ���� �� �ּ� ���� ���Ѵ�
SELECT MAX(salary) FROM employees;
SELECT MIN(salary) FROM employees;

-- �׷� �Լ��� �Ϲ� �÷��� �Բ� �Բ� ����� �� ����
SELECT
    last_name, salary
FROM
    employees
WHERE
    salary = (SELECT MAX(salary) FROM employees);
    
-- ��������01 : ���� �ֱٿ� �Ի��� ����� �Ի��ϰ�
-- �Ի����� ���� ������ ����� �Ի����� ����ϴ� �������� �ۼ��غ�����.
SELECT MAX(hire_date), MIN(hire_date) FROM employees;
-- �� �׷� �Լ��� �׷� �Ա������� �Բ� ����� �� �ִ�

-- COUNT(COL) : �ش� �÷��� ���� ������ ���Ѵ�
SELECT COUNT(salary) FROM employees;
SELECT COUNT(commission_pct) FROM employees; -- null�� ������ ���� �ʴ´�
SELECT COUNT(*) FROM employees; -- ��� ���� ����
SELECT 
    COUNT(*) AS "��ü�����",
    COUNT(commission_pct) AS "���ʽ� �޴� ��� ��",
    TRUNC(COUNT(commission_pct) / COUNT(*) * 100, 2) AS "���ʽ� �޴� ����� ����"
FROM 
    employees;

-- 80�� �μ� ����� �� ���ʽ� �޴� ����� ��
SELECT 
    COUNT(commission_pct) 
FROM 
    employees 
WHERE 
    department_id = 80 AND commission_pct > 0;

-- GRUOP BY
/*
    - �׷��Լ��� �׷� ���� ������ ����� ���� �ִ�
    - GROUP BY�� ������ �÷��� �̿��� �׷��� ������ �ȴ�
    - GROUP���� ���� ��쿡�� �׷��� ������ �����̵Ǵ� �÷��� �׷� �Լ��� �����
        �÷����� ������ �� �ִ�
*/
SELECT COUNT(*), job_id FROM employees GROUP BY job_id;
SELECT COUNT(*), department_id FROM employees GROUP BY department_id;

-- ��������01 : �� ��å�� ��� ������ ���غ����� (�� ���� �ƴ�, Ŀ�̼� ����)
SELECT
    job_id,
    AVG(salary) * 12 AS "��տ���"
FROM 
    employees
GROUP BY
    job_id;

-- �׷� �Լ��� ����� ���ǿ� ����ϴ� ���
-- �Ҽӵ� ����� 10�� �̻��� ��å
SELECT job_id FROM employees GROUP BY job_id HAVING COUNT(*) >= 10;

-- �Ҽӵ� ����� 10�� �̻��� �μ�
SELECT department_id FROM employees GROUP BY department_id HAVING COUNT(*) >= 10;

-- ��������03: �μ��� �ִ� �޿��� �ּ� �޿��� ����ϵ� �ִ� �޿��� 5000�̻��� �μ��� ����غ�����
SELECT MAX(salary) AS "�ִ�޿�", MIN(salary) AS "�ּұ޿�", department_id
FROM 
    employees GROUP BY department_id HAVING MAX(salary) >= 5000;
    
SELECT department_id, MAX(salary), MIN(salary)
FROM 
    employees GROUP BY department_id HAVING MAX(salary) >= 5000;

-- ��������04 : �μ��� ��� �޿��� ����ϵ� �ش� �μ��� �Ҽӵ� ����� 5���̻��� ��쿡�� ����غ�����
SELECT department_id, AVG(salary) AS "��ձ޿�"
FROM
    employees GROUP BY department_id HAVING COUNT(*) >= 5;

SELECT department_id, ROUND(AVG(salary), 2)
FROM
    employees GROUP BY department_id HAVING COUNT(*) >= 5;

-- �� �Ŵ����� �� �� �ð� �ִ����� �� �� ����
SELECT COUNT(*), manager_id FROM employees GROUP BY manager_id;

-- �� �Ŵ����� ���� ����� �߿� ������ �ִ� ����� �ִ� ��������� �� �� ����
SELECT COUNT(job_id), manager_id FROM employees GROUP BY manager_id;

-- �� �Ŵ����� ���� ����� �߿� ���ʽ��� �޴� ����� ��� ������ �� �� ����
SELECT COUNT(commission_pct), manager_id FROM employees GROUP BY manager_id;















