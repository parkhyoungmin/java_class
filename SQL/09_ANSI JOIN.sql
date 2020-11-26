--09_ANSI JOIN.sql

-- ANSI(미국 국가 표준 협회)에서 정한 표준을 따르는 JOIN문법

-- ANSI CROSS JOIN
SELECT * FROM employees CROSS JOIN departments;

-- ANSI INNER JOIN : 조건에 맞는 행만 등장하는 JOIN
SELECT * FROM employees e INNER JOIN departments d ON e.department_id = d.department_id;

/*
    ANSI OUTER JOIN : 조건에 안 맞는 행도 보도싶을때 사용하는 JOIN
    
        - LEFT OUTER JOIN : 오른쪽에 (+)를 붙인 경우와 같음
        - RIGHT OUTER JOIN : 왼쪽에 (+)를 붙인 경우와 같음
        - FULL OUTER JOIN : 양쪽에 (+)를 붙인 경우와 같음
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

-- ANSI JOIN을 이용할 때 JOIN조건에 이용되는 컬럼명이 같은 경우
-- USING을 이용해 쿼리문을 간소화 할 수 있다
SELECT * FROM employees e INNER JOIN departments d USING(department_id);
SELECT * FROM employees e LEFT OUTER JOIN departments d USING(department_id);
SELECT * FROM employees e RIGHT OUTER JOIN departments d USING(department_id);
SELECT * FROM employees e FULL OUTER JOIN departments d USING(department_id);

-- JOIN에 사용되는 조건과 필요해서 사용하는 조건이 구분된다
-- USING에 사용된 컬럼은 어느테이블의 컬럼인지 명확히 할 필요가 없어진다
SELECT 
    last_name, department_id, department_name 
FROM 
    employees e INNER JOIN departments d USING(department_id)
WHERE
    e.salary <= 10000
ORDER BY
    e.salary desc;

-- ANSI JOIN을 이용하여 풀어보세요
-- 연습문제01: FIRST_NAME이 Neena인 사원과 같은 도시에서 근무하는 모든 사원의 이름과 부서번호를 조회해보세요 -> 시애틀
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

-- 연습문제02: FIRST_NAME이 Neena인 사원과 급여가 5000이상 차이나지 않는 모든 사원을 조회해보세요
SELECT
    a.*
FROM 
    employees a
        INNER JOIN employees b on b.first_name = 'Neena' 
        AND a.salary BETWEEN b.salary - 5000 AND b.salary + 5000;

-- 연습문제03: 시애틀에서 근무하는 모든 사원의 이름/부서명/도시를 조회
SELECT DISTINCT
    first_name, last_name, city, department_name
FROM 
    employees 
        INNER JOIN departments d USING(department_id)
        INNER JOIN locations l USING(location_id)
WHERE
    l.city = 'Seattle';

-- 연습문제04: 매니저의 이름이 King인 모든 사원의 이름/직책명/연봉을 조회
SELECT
    a.first_name,
    a.last_name,
    jobs.job_title,
    a.salary * (NVL(a.commission_pct, 0) + 1) * 12
FROM
    employees a
    INNER JOIN employees b ON a.manager_id = b.employee_id AND b.last_name = 'King'
    INNER JOIN jobs ON a.job_id = jobs.job_id;










