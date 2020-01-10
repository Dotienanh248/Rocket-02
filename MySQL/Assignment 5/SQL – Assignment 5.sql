USE adventureworks;

-- Exercise 1: Subquery
/*Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
của ProductSubcategory là 'Saddles'.*/
SELECT	p.Name
FROM	product p
WHERE	p.ProductSubcategoryID IN (	SELECT	pcs.ProductSubcategoryID
									FROM	productsubcategory pcs
									WHERE	pcs.Name = 'Saddles');

/*Question 2: Thay đổi câu Query 1 để lấy được kết quả sau.
In this exercise you can change the previous query to deliver the following result set.*/
SELECT	p.Name
FROM	product p
WHERE	p.ProductSubcategoryID IN (	SELECT	pcs.ProductSubcategoryID
									FROM	productsubcategory pcs
									WHERE	pcs.Name like 'Bo%');
                                    
/*Question 3: Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring
Bike (nghĩa là ProductSubcategoryID = 3)*/
SELECT	NAME
FROM	product
WHERE	ProductSubcategoryID = 3 AND ListPrice = (	SELECT	MIN(ListPrice)
													FROM	product
                                                    WHERE	ProductSubcategoryID = 3);


-- Exercise 2: JOIN nhiều bảng
/*Question 1: Viết query lấy danh sách tên country và province được lưu trong AdventureWorks2008sample database.*/
SELECT 	c.Name, sp.Name
FROM	countryregion c
JOIN	stateprovince sp 
		ON	c.CountryRegionCode = sp.CountryRegionCode;	

/*Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada*/
SELECT	c.Name, sp.Name
FROM	countryregion c
JOIN    stateprovince sp 
		ON	c.CountryRegionCode = sp.CountryRegionCode
WHERE	c.`name` LIKE 'Germany%' OR c.`name` LIKE 'Canada%';

/*Question 3: 
SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột
BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale
được bao nhiêu người trong năm nay)*/
SELECT 
    sh.SalesOrderID,
    sh.OrderDate,
    sh.SalesPersonID,
    sp.Bonus,
    sp.SalesYTD
FROM	salesorderheader sh
JOIN	salesperson sp 
		ON	sh.SalesPersonID = sp.SalesPersonID;
    
/**Question 4: Sử dụng câu query, thêm cột JobTitle and xóa cột SalesPersonID và BusinessEntityID.*/
SELECT 
    sh.SalesOrderID,
    sh.OrderDate,
    sp.Bonus,
    e.Title,
    sp.SalesYTD
FROM	salesorderheader sh
JOIN    salesperson sp 
		ON	sh.SalesPersonID = sp.SalesPersonID
JOIN    employee e 
		ON 	sp.SalesPersonID = e.EmployeeID;