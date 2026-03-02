DELIMITER $$

CREATE PROCEDURE GetStudentByRoll(IN p_roll_no INT)
BEGIN
    SELECT *
    FROM Students
    WHERE roll_no = p_roll_no;
END $$

DELIMITER ;