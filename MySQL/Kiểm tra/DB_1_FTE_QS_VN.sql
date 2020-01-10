DROP DATABASE IF EXISTS Quan_ly_project;
CREATE DATABASE IF NOT EXISTS Quan_ly_project;
USE Quan_ly_project;

DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER
(
	CustomerID	SMALLINT AUTO_INCREMENT PRIMARY KEY,
	Name		NVARCHAR(35),
	Phone		VARCHAR(10),
	Email		VARCHAR(50),
	Address		VARCHAR(30),
	Note		VARCHAR(50)
);

DROP TABLE IF EXISTS CAR;
CREATE TABLE CAR
(
	CarID		VARCHAR(10)	PRIMARY KEY,
	Maker		ENUM ('HONDA','TOYOTA','NISSAN'),
	Model		VARCHAR(20),
	Year		YEAR,
	Color		VARCHAR(20),
    Note		VARCHAR(50)
);

DROP TABLE IF EXISTS CAR_ORDER;
CREATE TABLE CAR_ORDER
(
	OrderID			SMALLINT AUTO_INCREMENT PRIMARY KEY,
	CustomerID		SMALLINT,
	CarID			VARCHAR(10),
	Amount			TINYINT DEFAULT '1',
	SalePrice		BIGINT,
	OrderDate		DATE,
	DeliveryDate	DATE,
	DeliveryAddress	VARCHAR(50),
	Staus			ENUM('0','1','2') DEFAULT '0',
	Note			VARCHAR(50),
    FOREIGN KEY (CustomerID) REFERENCES CUSTOMER(CustomerID) ON DELETE CASCADE,
    FOREIGN KEY (CarID) REFERENCES CAR(CarID) ON DELETE CASCADE
);

INSERT INTO CUSTOMER
	(Name				,Phone		,Email						,Address	,Note	)
VALUE
	('Do Tien Anh'		,0989898989	,'dotienanh@gmail.com'		,'Ha Noi'	,''		),
    ('Pham Thu Hoai'	,0912345678	,'phamthuhoai@gmail.com'	,'Ha Noi'	,''		),
    ('Nong The Nhat'	,0914725836	,'nongthenhat@gmail.com'	,'Thai Binh',''		),
    ('Bui Huyen Trang'	,0936925814	,'buihuyentrang@gmail.com'	,'Ha Noi'	,''		),
    ('Nguyen Xuan Kien'	,0985274136	,'nguyenxuankien@gmail.com'	,'Bac Ninh'	,''		),
	('Vu Manh Nhat'		,0901236475	,'vumanhnhat@gmail.com'		,'Thai Binh',''		),
    ('Ha Van Tien'		,0963214587	,'havantien@gmail.com'		,'Thanh Hoa',''		),
    ('Duong Hoang Phuong',0985214763,'hoangphuong@gmail.com'	,'Ha Noi'	,''		),
    ('Pham Thi Thanh'	,0989262989	,'phamthithanh@gmail.com'	,'Ca mau'	,''		);

INSERT INTO CAR
	(CarID	,Maker		,Model		,Year	,Color		,Note	)
VALUE
	('H123'	,'HONDA'	,'CB300R'	,'2018'	,'black'	,''	),
    ('T147'	,'TOYOTA'	,'VIOS'		,'2019'	,'white'	,''	),
    ('N258'	,'NISSAN'	,'Sunny'	,'2020','black'		,''	),
    ('H632'	,'HONDA'	,'C125'		,'2018'	,'yellow'	,''	),
    ('N256'	,'NISSAN'	,'Murano'	,'2019'	,'white'	,''	);
 
 INSERT INTO car_order
	(CustomerID	,CarID	,Amount	,SalePrice		,OrderDate		,DeliveryDate	,DeliveryAddress,Staus	,Note)
VALUE
	('1'		,'H123'	,'2'	,'500.000.000'	,'20/11/2019'	,'30/11/2019'	,'Ha Noi'		,'1'	,'');


/*b) Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã
mua và sắp sếp tăng dần theo số lượng oto đã mua*/    
SELECT
	A.Name,
	C.Amount
FROM
	CUSTOMER A
JOIN
	CAR_ORDER C ON A.CustomerID = C.CustomerID
    ORDER BY Amount ASC; 
    
    
/*c) Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều
oto nhất trong năm nay.*/
SELECT	Maker
FROM	CAR;
/*d) Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của
những năm trước. In ra số lượng bản ghi đã bị xóa.*/