--09_ANSI JOIN.sql

-- ANSI(�̱� ���� ǥ�� ��ȸ)���� ���� ǥ���� ������ JOIN����

-- ANSI CROSS JOIN
SELECT * FROM employees CROSS JOIN departments;

-- ANSI INNER JOIN : ���ǿ� �´� �ุ �����ϴ� JOIN
SELECT * FROM employees e INNER JOIN departments d ON e.department_id = d.department_id;

/*
    ANSI OUTER JOIN : ���ǿ� �� �´� �൵ ���������� ����ϴ� JOIN
    
        - LEFT OUTER JOIN : �����ʿ� (+)�� ���� ���� ����
        - RIGHT OUTER JOIN : ���ʿ� (+)�� ���� ���� ����
        - FULL OUTER JOIN : ���ʿ� (+)�� ���� ���� ����
*/
SELECT
    e.first_name, d.department_name
FROM 
    employees e RIGHT OUTER JOIN departments d
ON
    e.department_id = d.department_id;

SELECT
    e.last_name, d.department_name
FROM 
    employees e LEFT OUTER JOIN departments d
ON
    e.department_id = d.department_id
    AND e.last_name = 'King';

SELECT
    e.first_name, d.department_name
FROM 
    employees e FULL OUTER JOIN departments d
ON
    e.department_id = d.department_id
    AND e.last_name = 'King'
ORDER BY
    e.last_name ASC;

-- ANSI JOIN�� �̿��� �� JOIN���ǿ� �̿�Ǵ� �÷����� ���� ���
-- USING�� �̿��� �������� ����ȭ �� �� �ִ�
SELECT * FROM employees e INNER JOIN departments d USING(department_id);
SELECT * FROM employees e LEFT OUTER JOIN departments d USING(department_id);
SELECT * FROM employees e RIGHT OUTER JOIN departments d USING(department_id);
SELECT * FROM employees e FULL OUTER JOIN departments d USING(department_id);

-- JOIN�� ���Ǵ� ���ǰ� �ʿ��ؼ� ����ϴ� ������ ���еȴ�
-- USING�� ���� �÷��� ������̺��� �÷����� ��Ȯ�� �� �ʿ䰡 ��������
SELECT 
    last_name, department_id, department_name 
FROM 
    employees e INNER JOIN departments d USING(department_id)
WHERE
    e.salary <= 10000
ORDER BY
    e.salary desc;

-- ANSI JOIN�� �̿��Ͽ� Ǯ�����
-- ��������01: FIRST_NAME�� Neena�� ����� ���� ���ÿ��� �ٹ��ϴ� ��� ����� �̸��� �μ���ȣ�� ��ȸ�غ����� -> �þ�Ʋ
SELECT 
    first_name, last_name, department_id
FROM
    employees 
        INNER JOIN departments USING(department_id)
        INNER JOIN locations USING(location_id)
WHERE 
    city = (
SELECT
    city
FROM
    employees 
        INNER JOIN departments USING(department_id)
        INNER JOIN locations USING(location_id)
WHERE
    first_name = 'Neena');

-- ��������02: FIRST_NAME�� Neena�� ����� �޿��� 5000�̻� ���̳��� �ʴ� ��� ����� ��ȸ�غ�����
SELECT
    a.*
FROM 
    employees a
        INNER JOIN employees b on b.first_name = 'Neena' 
        AND a.salary BETWEEN b.salary - 5000 AND b.salary + 5000;

-- ��������03: �þ�Ʋ���� �ٹ��ϴ� ��� ����� �̸�/�μ���/���ø� ��ȸ
SELECT DISTINCT
    first_name, last_name, city, department_name
FROM 
    employees 
        INNER JOIN departments d USING(department_id)
        INNER JOIN locations l USING(location_id)
WHERE
    l.city = 'Seattle';

-- ��������04: �Ŵ����� �̸��� King�� ��� ����� �̸�/��å��/������ ��ȸ
SELECT
    a.first_name,
    a.last_name,
    jobs.job_title,
    a.salary * (NVL(a.commission_pct, 0) + 1) * 12
FROM
    employees a
    INNER JOIN employees b ON a.manager_id = b.employee_id AND b.last_name = 'King'
    INNER JOIN jobs ON a.job_id = jobs.job_id;










