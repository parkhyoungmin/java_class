-- �� ��ȣ�� ���̺�
CREATE TABLE license_plate (
    CAR_ID NUMBER(4),
    CAR_NAME VARCHAR2(30),
    CAR_PLATE VARCHAR2(30)
);
SELECT * FROM license_plate;
DROP TABLE license_plate PURGE;

-- �� ��ȣ�� ������
CREATE SEQUENCE CPLATE_SEQ START WITH 1 INCREMENT BY 1;
SELECT * FROM user_sequences;

-- �ߺ� Ȯ��
SELECT CAR_PLATE FROM license_plate GROUP BY CAR_PLATE HAVING COUNT (CAR_PLATE) > 1;

-- �ߺ� ����
SELECT DISTINCT (CAR_PLATE) FROM license_plate;

SELECT * FROM coffees;










