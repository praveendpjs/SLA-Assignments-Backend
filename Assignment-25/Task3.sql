DELIMITER $$

CREATE PROCEDURE GetStudentsAbove75()
BEGIN
    SELECT *
    FROM Students
    WHERE marks > 75;
END $$

DELIMITER ;