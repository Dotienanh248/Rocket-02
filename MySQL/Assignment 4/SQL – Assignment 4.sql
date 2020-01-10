-- DROP DATABASE IF EXIT
DROP DATABASE IF EXISTS Quanly;
CREATE DATABASE IF NOT EXISTS Quanly;
USE Quanly;

-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
-- Bảng phòng ban
DROP TABLE IF EXISTS Department;
CREATE TABLE Department
(
	Department_Number		NVARCHAR(10) PRIMARY KEY,
	Department_Name			NVARCHAR(50) NOT NULL
);
-- Bảng nhân viên
DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table 
(
	Employee_Number 		TINYINT PRIMARY KEY,
    Employee_Name			NVARCHAR(35) NOT NULL,
    Department_Number		NVARCHAR(10) NOT NULL,
	FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);
-- Bảng kỹ năng nhân viên
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table
(
	Employee_Number 		TINYINT NOT NULL,
    Skill_Code				NVARCHAR(30) NOT NULL,
    Date_Registered			DATETIME NOT NULL,
    FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);


-- Question 2: Thêm ít nhất 10 bản ghi vào table
-- Thêm bản ghi phòng ban
INSERT INTO Department
VALUE
	('CNTT'	,'Cong nghe thong tin'	),
    ('KHMT'	,'Khoa hoc may tinh'	),
    ('QTKD'	,'Quan tri kinh doanh'	),
    ('BH'	,'Bao hiem'				),
    ('KT'	,'Ke toan'				),
    ('GD'	,'Giam doc'				),
    ('CN'	,'Cong nghe'			),
    ('BV'	,'Bao ve'				),
    ('KD'	,'Kinh doanh'			),
    ('PV'	,'Phuc vu'				);
-- Thêm bản ghi nhân viên
INSERT INTO Employee_Table
VALUE
	(1	,'Do Tien Anh'			,'CNTT'),
    (2	,'Ha Van Tien'			,'KHMT'	),
    (3	,'Pham Thu Hoai'		,'QTKD'	),
    (4	,'Bui Huyen Trang'		,'CNTT'	),
    (5	,'Nong The Nhat'		,'KT'	),
    (6	,'Vu Manh Nhat'			,'CNTT'	),
    (7	,'Duong Hoang Phuong'	,'CNTT'	),
    (8	,'Trinh Xuan Huy'		,'KHMT'	),
    (9	,'Dang Thu Phuong'		,'KD'	),
    (10	,'Nguyen Mai Quynh'		,'BV'	);
-- Thêm bản ghi kĩ năng nhân viên
INSERT INTO Employee_Skill_Table
VALUE
	(1	,'JAVA'		,'2020/8/24'	),
    (2	,'JAVA'		,'2010/10/12'	),
    (3	,'ANDROID'	,'2009/5/5'		),
    (2	,'ANDROID'	,'2003/2/10'	),
    (5	,'DEV C'	,'2019/3/12'	),
    (6	,'DEV C'	,'2019/8/10'	),
    (1	,'PYTHON'	,'2018/2/2'		),
    (8	,'C#'		,'2019/10/3'	),
    (9	,'C#'		,'2020/1/1'		),
    (10	,'PYTHON'	,'2019/1/3'		);

  
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java.
SELECT
	B.Employee_Name
FROM
	Employee_Table B
JOIN
	Employee_Skill_Table C ON B.Employee_Number = C.Employee_Number
    AND C.Skill_Code = 'JAVA';


-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT
	A.Department_Number,
	A.Department_Name
FROM
	Department A
JOIN
	Employee_Table B ON A.Department_Number = B.Department_Number
GROUP BY
	B.Department_Number
HAVING
	COUNT(B.Department_Number) > 3;


-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
SELECT
	A.Department_Name,
    GROUP_CONCAT(B.Employee_Name)
FROM
	Department A
JOIN
	Employee_Table B ON A.Department_Number = B.Department_Number
GROUP BY
	B.Department_Number;




-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT
	B.Employee_Number,
	COUNT(C.Skill_Code)	AS Number_Skill,
    B.Employee_Name
FROM
	Employee_Table B
left join
	Employee_Skill_Table C ON B.Employee_Number = C.Employee_Number
GROUP BY
	C.Employee_Number
HAVING
	COUNT(C.Skill_Code) > 1;
