import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task1 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean isValidUser = validateLogin(username, password);

        if (isValidUser) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
        sc.close();
    }
    public static boolean validateLogin(String username, String password) {

        String sql = "SELECT * FROM users WHERE username = ? AND password_hash = ?";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            return rs.next(); 

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
