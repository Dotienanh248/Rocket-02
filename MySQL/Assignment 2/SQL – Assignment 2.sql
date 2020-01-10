	-- Exercise 1:Design a table
-- DROP DATABASE IF EXIT
DROP DATABASE IF EXISTS Quanlyfresher;
CREATE DATABASE IF NOT EXISTS Quanlyfresher;
USE Quanlyfresher;

-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee
(
	TraineeID			SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Full_name			NVARCHAR(40) NOT NULL,
    Brith_Date			DATE NOT NULL,
    Gender				ENUM('male','female','unknown'),
    ET_IQ				TINYINT CHECK ((ET_IQ >= 0) AND (ET_IQ <= 20)),
    ET_Gmath			TINYINT CHECK((ET_Gmath >= 0) AND (ET_Gmath <= 20)),
    ET_English			TINYINT CHECK((ET_English >= 0) AND (ET_English <= 50)),
    Training_Class		CHAR(10) NOT NULL,
    Evaluation_Notes	NVARCHAR(200)
);

-- Question 2: thêm trường VTI_Account với điều kiện not null & unique
ALTER TABLE Trainee
	ADD COLUMN VTI_Account		NVARCHAR(30) NOT NULL UNIQUE;
    

	-- Exercise 2: Data Types
DROP TABLE IF EXISTS Bang1;
CREATE TABLE Bang1
(
	ID1					MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
    Name_ID1			NVARCHAR(35) NOT NULL,
    Code				TINYINT CHECK((Code >= 0) AND (Code <=5)),
    ModifiedData_ID1	DATETIME
);


	-- Exercise 3: Data Types (2)
DROP TABLE IF EXISTS Bang2;
CREATE TABLE Bang2
(
	ID2					MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
    Name_ID2			NVARCHAR(40) NOT NULL,
    BrithDate_ID2		DATE NOT NULL,
    Gender_ID2			ENUM('male','female','unknown'),
    IsDeletedFlag_ID2	TINYINT
);
