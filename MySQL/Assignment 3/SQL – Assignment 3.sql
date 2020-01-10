USE Quanlyfresher;
-- EX1:
-- Question 1: Thêm ít nhất 10 bản ghi vào table
TRUNCATE TABLE Trainee;
INSERT INTO Trainee
 	(Full_name		,Brith_Date		,Gender		,ET_IQ	,ET_Gmath	, ET_English,Training_Class	,Evaluation_Notes, VTI_Account)
VALUE
	('Do Tien Anh'	,'1999/8/24'	,'male'		,20		,15			,30			,'CNTT59B'		,'no'			 ,'dotienanh@vti.com'),
	('Nong The Nhat','1999/3/2'		,'male'		,'15'	,'10'		,'50'		,'CNTT59A'		,'NO'			 ,'nongthenhat@vti.com'),
	('Pham Thu Hoai','1999/2/10'	,'female'	,'20'	,'6'		,'40'		,'CNTT60B'		,'yes'			 ,'phamthithuhoai@vti.com'),
	('Bui Huyen Trang','1999/3/11'	,'male'		,'10'	,'10'		,'9'		,'CNTT61A'		,'NO'			 ,'buihuyentrang@vti.com'),
	('Vu Manh Nhat'	,'1999/8/13'	,'female'	,'20'	,'5'		,'30'		,'CNTT58A'		,'Yes'			 ,'vumanhnhat@vti.com'),
	('Pham Tien Thinh','1999/12/10'	,'unknown'	,'10'	,'20'		,'25'		,'CNTT59B'		,'NO'			 ,'phamtienthinh@vti.com'),
	('Ha Van Tien'	,'1999/1/10'	,'unknown'	,'9'	,'20'		,'20'		,'CNTT59A'		,'no'			 ,'havantien@vti.com'),
	('Kien'			,'1999/1/20'	,'male'		,'20'	,'7'		,'0'		,'CNTT58B'		,'Yes'			 ,'kien@vti.com'),
	('Le Quang Tu'	,'1999/4/10'	,'unknown'	,'4'	,'8'		,'1'		,'CNTT60B'		,'NO'			 ,'lequangtu@vti.com'),
	('Bui Van Tien'	,'1999/11/30'	,'unknown'	,'3'	,'8'		,'10'		,'CNTT61B'		,'NO'			 ,'buivantien@vti.com'),
	('Nguyen Viet Anh','1999/2/10'	,'male'		,'3'	,'6'		,'6'		,'CNTT61A'		,'NO'			 ,'nguyenvietanh@vti.com');

-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau
SELECT
	MONTH(Brith_Date),
    COUNT(Brith_Date)						AS NUMBER_PEOPLE,
    GROUP_CONCAT(Full_name SEPARATOR ', ') 	AS PEOPLE
FROM
	Trainee
WHERE
	ET_IQ >= 10
GROUP BY MONTH(Brith_Date)
HAVING COUNT(Brith_Date);

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: 
-- tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
SELECT 
	Full_name,
    (YEAR(NOW()) - YEAR(Brith_Date))	AS AGE,
    Gender,
    ET_IQ,
    ET_Gmath,
    ET_English,
    Training_Class,
    Evaluation_Notes,
    VTI_Account
FROM
	Trainee
WHERE
	LENGTH(Full_name) = (SELECT	MAX(LENGTH(Full_name))
						 FROM	Trainee);

-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
-- (ET_IQ + ET_Gmath>=20) && (ET_IQ>=8) && (ET_Gmath>=8) && (ET_English>=18)
SELECT *
FROM Trainee
WHERE
	(ET_IQ + ET_Gmath) >= 20	AND
    ET_IQ >=8	AND
    ET_Gmath >= 8	AND
    ET_English >=18;

-- Question 5: xóa thực tập sinh có TraineeID = 3
-- Kiem tra
SELECT *
FROM Trainee
WHERE TraineeID = 3;
-- Thuc hien xoa
DELETE FROM Trainee
WHERE TraineeID = 3;

-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "CNTT59B". Hãy cập nhật thông tin vào database
-- Kiem tra
SELECT *
FROM Trainee
WHERE TraineeID = 5;
-- Thuc hien cap nhat
UPDATE
	Trainee
SET
	Training_Class = 'CNTT59B'
WHERE
	TraineeID = 5;
