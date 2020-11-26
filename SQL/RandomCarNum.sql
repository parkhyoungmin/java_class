-- 차 번호판 테이블
CREATE TABLE license_plate (
    CAR_ID NUMBER(4),
    CAR_NAME VARCHAR2(30),
    CAR_PLATE VARCHAR2(30)
);
SELECT * FROM license_plate;
DROP TABLE license_plate PURGE;

-- 차 번호판 시퀀스
CREATE SEQUENCE CPLATE_SEQ START WITH 1 INCREMENT BY 1;
SELECT * FROM user_sequences;

-- 중복 확인
SELECT CAR_PLATE FROM license_plate GROUP BY CAR_PLATE HAVING COUNT (CAR_PLATE) > 1;

-- 중복 제거
SELECT DISTINCT (CAR_PLATE) FROM license_plate;

SELECT * FROM coffees;










