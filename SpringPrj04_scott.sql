SELECT USER
FROM DUAL;
--==> SCOTT


--�� ���̺� ����
CREATE TABLE TBL_MEMBERLIST
( ID        VARCHAR2(30)    NOT NULL
, PW        VARCHAR2(50)    NOT NULL
, NAME      VARCHAR2(50)    NOT NULL
, TEL       VARCHAR2(50)    NOT NULL
, EMAIL     VARCHAR2(100)
, CONSTRAINT MEMBERLIST_ID_PK PRIMARY KEY(ID)
);
--==> Table TBL_MEMBERLIST��(��) �����Ǿ����ϴ�.

--�� ������ �Է�(��ȣȭ ��Ű�� CRYPTPACK Ȱ��)
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL) 
VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'admin'), '������', '010-1122-3344', 'admin@test.com');
--==> 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ȯ��
SELECT *
FROM TBL_MEMBERLIST;
--==> admin	-#O?|/	������	010-1122-3344	admin@test.com

--�� Ŀ��
COMMIT;
--==> Ŀ�� �Ϸ�.

--�� �⺻ ��ȸ ������ ����
SELECT ID, NAME, TEL, EMAIL
FROM TBL_MEMBERLIST;
--> �� �� ����
SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST
;
--==> admin	������	010-1122-3344	admin@test.com

--�� ������ �߰� �Է�(DAO ������ ���� ���� ���� �ǽ��� ���� �غ� - ���� ȯ�� ����)
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL) 
VALUES('lhs', CRYPTPACK.ENCRYPT('java006$', 'lhs'), '���ϼ�', '010-5245-4613', 'gktjd011@naver.com');
--==> 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ȯ��
SELECT ID, NAME, TEL, EMAIL
FROM TBL_MEMBERLIST;
/*
admin	������	010-1122-3344	admin@test.com
lhs	���ϼ�	010-5245-4613	gktjd011@naver.com
*/

--�� Ŀ��
COMMIT;
--==> Ŀ�� �Ϸ�.






































