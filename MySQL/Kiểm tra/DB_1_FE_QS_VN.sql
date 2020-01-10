/*a) Tạo table với các ràng buộc và kiểu dữ liệu*/
DROP DATABASE IF EXISTS QL_Diem;
CREATE DATABASE IF NOT EXISTS QL_Diem;
USE QL_Diem;

DROP TABLE IF EXISTS Student;
CREATE TABLE IF NOT EXISTS Student
(
	RN		VARCHAR(6)	PRIMARY KEY,
    Name	VARCHAR(35)	NOT NULL,
    Age		TINYINT NOT NULL,
    Gender	ENUM('0','1')
);

DROP TABLE IF EXISTS Subjectt;
CREATE TABLE IF NOT EXISTS Subjectt
(
	sID		VARCHAR(10) PRIMARY KEY,
    sName	VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS StudentSubject;
CREATE TABLE IF NOT EXISTS StudentSubject
(
	RN		VARCHAR(6),
    sID		VARCHAR(10),
    Mark	TINYINT NOT NULL,
    Date	DATE NOT NULL,
    FOREIGN KEY (RN) REFERENCES Student(RN) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (sID) REFERENCES Subjectt(sID) ON DELETE CASCADE ON UPDATE CASCADE
);

/*Thêm ít nhất 3 bản ghi vào table*/
INSERT INTO	Student
	(RN			,Name						,Age	,Gender	)
VALUES
	('123456'	,'Do Tien Anh'				,20		,'0'	),
	('654321'	,'Pham Thi Thu Hoai'		,18		,'1'	),
    ('123635'	,'Bui Thi Huyen Trang'		,22		,'1'	);
    
INSERT INTO	Subjectt
	(sID	,sName					)
VALUES
	('QTKD'	,'Quan Tri Kinh Doanh'	),
	('KTVM'	,'Kinh Te Vi Mo'		),
    ('TCC'	,'Toan Cao Cap'			),
    ('QLH'	,'Quan Ly Hoc'			);

INSERT INTO	StudentSubject
	(RN			,sID	,Mark	,Date		)
VALUES
	('123456'	,'QTKD'	,10		,'2019/12/1'),
	('654321'	,'KTVM'	,9		,'2019/12/3'),
    ('123635'	,'QTKD'	,8		,'2019/11/2'),
	('123456'	,'QLH'	,7		,'2018/6/12'),
    ('654321'	,'QLH'	,4		,'2018/5/21');
    
    
/*b) Viết lệnh để
a. Lấy tất cả các môn học không có bất kì điểm nào*/
SELECT	S.sID, S.sName
FROM	Subjectt S
LEFT JOIN StudentSubject SS
	ON S.sID = SS.sID
WHERE	SS.sID IS NULL;
/*b. Lấy danh sách các môn học có ít nhất 2 điểm*/
SELECT	S.sID, S.sName, COUNT(SS.sID)
FROM	Subjectt S, StudentSubject SS
WHERE	S.sID = SS.sID
GROUP BY	SS.sID
HAVING	COUNT(SS.sID)>=2;


/*c) Tạo "StudentInfo" view có các thông tin về học sinh bao gồm:
RN,sID,Name, Age, Gender, sName, Mark, Date. Với cột Gender show
Male để thay thế cho 0, Female thay thế cho 1 và Unknow thay thế cho
null.*/
DROP TABLE IF EXISTS StudentInfo;
CREATE TABLE IF NOT EXISTS StudentInfo
(
	SELECT	
		ST.RN,
		SU.sID,
        ST.Name,
        ST.Age,
        ST.Gender,
        SU.sName,
        SS.Mark,
        SS.Date
    FROM	Student ST
    JOIN	StudentSubject SS	ON ST.RN = SS.RN
    JOIN	Subjectt SU			ON SU.sID = SS.sID	
);

SELECT *
FROM StudentInfo;


/*d) Tạo trigger cho table Subject:
a. Trigger CasUpdate: khi thay đổi data của cột sID, thì giá trị của
cột sID của table StudentSubject cũng thay đổi theo*/
DROP TRIGGER IF EXISTS CasUpdate ;
DELIMITER $$
CREATE TRIGGER CasUpdate
AFTER UPDATE ON Subjectt 
FOR EACH ROW
    BEGIN
      UPDATE StudentSubject
      set sID=New.sID
      where sID=Old.sID
	;
    END$$
DELIMITER ;

UPDATE Subjectt 
SET    sID = '142536'
WHERE  sName = 'QLH';

SELECT *
FROM   StudentSubject;

/*b. Trigger casDel: Khi xóa 1 student, các dữ liệu của table
StudentSubject cũng sẽ bị xóa theo*/
DROP TRIGGER IF EXISTS casDel;
DELIMITER $$
CREATE TRIGGER casDel
AFTER DELETE ON Student 
FOR EACH ROW
    BEGIN
    DELETE FROM StudentSubject 
    WHERE       StudentSubject.RN = OLD.RN;
    END$$
DELIMITER ;    

DELETE FROM Student
WHERE  RN = '123456';

SELECT * FROM   StudentSubject;

/*e) Viết 1 thủ tục (có 2 parameters: student name, mark). Thủ tục sẽ xóa tất cả
các thông tin liên quan tới học sinh có cùng tên như parameter và tất cả
các điểm nhỏ hơn của các học sinh đó.
Trong trường hợp nhập vào "*" thì thủ tục sẽ xóa tất cả các học sinh*/
DROP PROCEDURE IF EXISTS XoaHS

DELIMITER $$
CREATE PROCEDURE XoaHS(IN v_Name NVARCHAR(50), IN v_Mark CHAR(5) )
    BEGIN
           
    END$$
DELIMITER ;

CALL XoaHS();
