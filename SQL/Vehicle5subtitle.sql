SELECT
    *
FROM license_plate;

SELECT
    CAR_ID, CAR_NAME, SUBSTR(car_plate, 8) AS end_num, car_plate
FROM 
    license_plate;

SELECT to_char(sysdate, 'DAY') FROM dual;


SELECT CAR_ID, CAR_NAME, SUBSTR(car_plate, 8) AS end_num, car_plate,
    DECODE(end_num, 
            (1, 6), '����', 
            (2, 7), '����',
            (3, 8), '����'
    ) AS manager_name 
FROM 
    license_plate;



SELECT
    r.*,'����'
FROM license_plate r WHERE REGEXP_LIKE (r.car_plate, '7$|4$')



SELECT
    r.*,
    CASE
        WHEN to_char(sysdate, 'DY') = '��'
             AND substr(r.car_plate, 8) IN ( '4', '9' ) THEN
            '����'
        WHEN to_char(sysdate, 'DY') = '��'
             AND substr(r.car_plate, 8) IN ( '5', '0' ) THEN
            '����'
        WHEN to_char(sysdate, 'DY') = '��'
             AND substr(r.car_plate, 8) IN ( '1', '6' ) THEN
            '����'
        WHEN to_char(sysdate, 'DY') = 'ȭ'
             AND substr(r.car_plate, 8) IN ( '2', '7' ) THEN
            '����'
        WHEN to_char(sysdate, 'DY') = '��'
             AND substr(r.car_plate, 8) IN ( '3', '8' ) THEN
            '����'
        ELSE '����'
    END AS "���ݿ���"
FROM
    license_plate r;




