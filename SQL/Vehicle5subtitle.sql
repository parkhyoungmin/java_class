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
            (1, 6), '위반', 
            (2, 7), '위반',
            (3, 8), '위반'
    ) AS manager_name 
FROM 
    license_plate;



SELECT
    r.*,'위반'
FROM license_plate r WHERE REGEXP_LIKE (r.car_plate, '7$|4$')



SELECT
    r.*,
    CASE
        WHEN to_char(sysdate, 'DY') = '목'
             AND substr(r.car_plate, 8) IN ( '4', '9' ) THEN
            '위반'
        WHEN to_char(sysdate, 'DY') = '금'
             AND substr(r.car_plate, 8) IN ( '5', '0' ) THEN
            '위반'
        WHEN to_char(sysdate, 'DY') = '월'
             AND substr(r.car_plate, 8) IN ( '1', '6' ) THEN
            '위반'
        WHEN to_char(sysdate, 'DY') = '화'
             AND substr(r.car_plate, 8) IN ( '2', '7' ) THEN
            '위반'
        WHEN to_char(sysdate, 'DY') = '수'
             AND substr(r.car_plate, 8) IN ( '3', '8' ) THEN
            '위반'
        ELSE '정상'
    END AS "위반여부"
FROM
    license_plate r;




