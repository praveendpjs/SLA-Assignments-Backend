DELIMITER $$

CREATE PROCEDURE GetAverageMarks()
BEGIN
    SELECT AVG(marks) AS average_marks
    FROM Students;
END $$

DELIMITER ;