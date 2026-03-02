DELIMITER $$

CREATE PROCEDURE GetTotalStudentCount()
BEGIN
    SELECT COUNT(*) AS total_students
    FROM Students;
END $$

DELIMITER ;