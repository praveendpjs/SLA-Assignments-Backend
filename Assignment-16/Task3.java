import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task3 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "your_db_password";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department name: ");
        String department = sc.nextLine();

        increaseSalaryByDepartment(department);
    }
    public static void increaseSalaryByDepartment(String department) {

        String sql = "UPDATE employees SET salary = salary * 1.10 WHERE department = ?";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, department);

            int rowsUpdated = pstmt.executeUpdate();

            System.out.println(rowsUpdated + " employee salaries updated successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
