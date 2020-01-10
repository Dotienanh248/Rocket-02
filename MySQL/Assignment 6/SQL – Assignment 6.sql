-- DROP DATABASE IF EXIT
DROP DATABASE IF EXISTS Project_Manager;
CREATE DATABASE IF NOT EXISTS Project_Manager;
USE Project_Manager;

/* a) Tạo table với các ràng buộc và kiểu dữ liệu và thêm ít nhất 3 bản ghi vào  mỗi table trên */
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
	EmployeeID					INT AUTO_INCREMENT PRIMARY KEY,
	EmployeeLastName			CHAR(15) NOT NULL,
	EmployeeFistName			CHAR(15) NOT NULL,
	EmployeeHireDate			DATE NOT NULL,
	EmployeeStatus				VARCHAR(3) CHECK((EmployeeStatus = 'YES') OR (EmployeeStatus = 'NO')),
	SupervisorID				INT NOT NULL,
	SocialSecurityNumber		INT NOT NULL
);
DROP TABLE IF EXISTS Projects;
CREATE TABLE Projects
(
	ProjectID					VARCHAR(10) PRIMARY KEY,
    EmployeeID					INT AUTO_INCREMENT,
	ProjectName					VARCHAR(30) NOT NULL,
	ProjectStartDate			DATE NOT NULL,
	ProjectDescription			VARCHAR(30) NOT NULL,
	ProjectDetailt				VARCHAR(50) NOT NULL,
	ProjectCompletedOn			DATE NOT NULL,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);
DROP TABLE IF EXISTS Project_Modules;
CREATE TABLE Project_Modules
(
	ModuleID					INT PRIMARY KEY,
    ProjectID					VARCHAR(10) NOT NULL,
    EmployeeID					INT AUTO_INCREMENT,
    ProjectModulesDate			DATE NOT NULL,
    ProjectModulesCompledOn		DATE NOT NULL,
    ProjectModulesDescription	VARCHAR(30) NOT NULL,
    FOREIGN KEY (ProjectID) REFERENCES Projects(ProjectID),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);
DROP TABLE IF EXISTS Work_Done;
CREATE TABLE Work_Done
(
	WorkDoneID					INT PRIMARY KEY,
	EmployeeID					INT AUTO_INCREMENT,
	ModuleID					INT NOT NULL,
	WorkDoneDate				DATE NOT NULL,
	WorkDoneDescription			VARCHAR(30) NOT NULL,
	WorkDoneStatus				VARCHAR(3) CHECK((WorkDoneStatus = 'YES') OR (WorkDoneStatus = 'NO')),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ModuleID) REFERENCES Project_Modules(ModuleID)
);

INSERT INTO Employee
	(EmployeeLastName	,EmployeeFistName	,EmployeeHireDate	,EmployeeStatus	,SupervisorID	,SocialSecurityNumber	)
VALUE
	('Do'				,'Tien Anh'			,'2018/12/30'		,'YES'			,'1'			,'10'					),
    ('Nong'				,'The Nhat'			,'2019/10/10'		,'NO'			,'3'			,'5'					),
    ('Vu'				,'Manh Nhat'		,'2017/10/30'		,'YES'			,'2'			,'8'					);
    
INSERT INTO Projects
	(ProjectID	,ProjectName		,ProjectStartDate	,ProjectDescription		,ProjectDetailt		,ProjectCompletedOn	)
VALUE
	('QLBH'		,'Quan ly ban hang'	,'2019/1/1'			,'Ban dien thoai'		,'Samsung'			,'2019/2/1'			),
    ('QLNV'		,'Quan ly nhan vien','2019/2/13'		,'So ngay di lam'		,'Ngay cong'		,'2019/3/13'		),
    ('QLD'		,'Quan ly diem'		,'2019/9/5'			,'Diem tung mon hoc'	,'Trung binh diem'	,'2019/12/31'		);

INSERT INTO Project_Modules
	(ModuleID	,ProjectID	,ProjectModulesDate,ProjectModulesCompledOn	,ProjectModulesDescription	)
VALUE
	('231'		,'QLD'		,'2019/1/1'			,'2019/2/1'				,'Module QLD'				),
    ('135'		,'QLNV'		,'2019/2/13'		,'2019/3/13'			,'Module QLNV'				),
    ('210'		,'QLBH'		,'2019/9/5'			,'2019/12/31'			,'Module QLBH'				);

INSERT INTO Work_Done
	(WorkDoneID	,ModuleID	,WorkDoneDate	,WorkDoneDescription,WorkDoneStatus	)
VALUE
	('211'		,'231'		,'2019/1/1'		,'2019/2/1'			,'NO'	),
    ('301'		,'135'		,'2019/2/13'	,'2019/3/13'		,'NO'	),
    ('103'		,'210'		,'2019/9/5'		,'2019/12/31'		,'YES'	);
    
 /*b) Viết stored procedure (không có parameter) để Remove tất cả thông tin project đã hoàn thành sau 3 tháng kể từ ngày hiện.
 In số lượng record đã remove từ các table liên quan trong khi removing (dùng lệnh print)*/

/*c) Viết stored procedure (có parameter) để in ra các module đang được thực hiện)*/

/*d) Viết hàm (có parameter) trả về thông tin 1 nhân viên đã tham gia làm mặc dù không ai giao việc cho nhân viên đó (trong bảng Works)*/

