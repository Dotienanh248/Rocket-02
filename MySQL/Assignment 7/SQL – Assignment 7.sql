USE Project_Manager;

/* Exercise 1: Tiếp tục với Database ở buổi 6
Viết triggers để tránh trường hợp người dùng nhập thông tin module Project không hợp lệ
(Project_Modules.ProjectModulesDate < Projects.ProjectStartDate,
Project_Modules.ProjectModulesCompletedOn > Projects.ProjectCompletedOn)*/
DROP TRIGGER IF EXISTS thongtinnguoidung;
DELIMITER $$

CREATE TRIGGER thongtinnguoidung
BEFORE INSERT ON Project_Modules
FOR EACH ROW
BEGIN
	DECLARE	V_ProjectStartDate, V_ProjectCompletedOn DATE;
    SELECT	ProjectStartDate, ProjectCompletedOn INTO V_ProjectStartDate, V_ProjectCompletedOn
    FROM 	Projects p
    WHERE	ProjectID = NEW.ProjectID;
    
IF NEW.ProjectModulesDate < V_ProjectStartDate
	OR NEW.ProjectModulesCompledOn >  V_ProjectCompletedOn THEN
	SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = 'du lieu cua ban khong hop le';
	END IF;
END $$
DELIMITER ;

INSERT INTO Project_Modules
	(ModuleID	,ProjectID	,ProjectModulesDate,ProjectModulesCompledOn	,ProjectModulesDescription	)
VALUE
    ('210'		,'123'		,'2019/9/5'			,'2019/12/31'			,'Module QLBH'				);
    
    
/*Exercise 2: View
Trong database phần Assignment 3, Tạo 1 VIEW để lấy ra tất cả các thực tập sinh là ET,
1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
	ET_IQ + ET_Gmath>=20
	ET_IQ>=8
	ET_Gmath>=8
	ET_English>=18 */
USE Quanlyfresher;
DROP VIEW IF EXISTS v_emp_pass_test ;
CREATE VIEW v_emp_pass_test AS
SELECT	full_name AS ET_fresher_pass
FROM    Trainee
WHERE	(ET_IQ + ET_Gmath) >= 20 
	AND ET_IQ >= 8
    AND ET_Gmath >= 8
    AND ET_English >= 18;