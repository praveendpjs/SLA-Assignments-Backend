DELIMITER //

CREATE PROCEDURE insert_student(
    IN p_id INT,
    IN p_name VARCHAR(100),
    IN p_marks INT
)
BEGIN

    INSERT INTO student(id, name, marks)
    VALUES(p_id, p_name, p_marks);

END //

DELIMITER ;