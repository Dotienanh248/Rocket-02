DROP DATABASE IF EXISTS user;
-- Create database
CREATE DATABASE IF NOT EXISTS user;
USE user;

-- Create table User
DROP TABLE IF EXISTS Users;
CREATE TABLE  Users
(
	Id 			SMALLINT AUTO_INCREMENT PRIMARY KEY,
    FirstName 	VARCHAR(30) NOT NULL,
    LastName 	VARCHAR(10) NOT NULL,
    Phone		VARCHAR(12) NOT NULL,
    Email 		VARCHAR(50) UNIQUE NOT NULL,
	Password 	VARCHAR(12) NOT NULL
);

-- Create table manager
DROP TABLE IF EXISTS Manager;
CREATE TABLE IF NOT EXISTS Manager
(
	Id 				SMALLINT AUTO_INCREMENT PRIMARY KEY,
    ExpInYear		TINYINT NOT NULL,
    IdUser			SMALLINT NOT NULL,
    FOREIGN KEY (IdUser) REFERENCES Users(Id)
);

-- Create table
DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS 	Employee
(
	Id 				SMALLINT AUTO_INCREMENT PRIMARY KEY,
    IdUser			SMALLINT NOT NULL,
    ProjectName		VARCHAR(255) NOT NULL,
    Skill			VARCHAR(255) NOT NULL,
	FOREIGN KEY 	(IdUser) REFERENCES Users(Id)
);

INSERT INTO   Users
	(Email							, Password	, FirstName		, LastName	, Phone			)
VALUES
	('anh.dotien@vti.com.vn'		, 'Anh123'	, 'Do Tien'		, 'Anh'		, '0988696969'	),
	('huyen.trinhkhanh@vti.com.vn'	, 'Huyen123', 'Trinh Khanh'	, 'Huyen'	, '0988999666'	);
     