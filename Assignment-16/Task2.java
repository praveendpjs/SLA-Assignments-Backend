import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class Task2 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (isEmailDuplicate(email)) {
            System.out.println("Email already registered. Try another.");
        } else {
            registerUser(username, email, password);
        }
        sc.close();
    }
    public static boolean isEmailDuplicate(String email) {
        String sql = "SELECT 1 FROM users WHERE email = ? LIMIT 1";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, email);

            ResultSet rs = pstmt.executeQuery();
            return rs.next(); // true if email exists

        } catch (SQLException e) {
            e.printStackTrace();
            return true; // Fail safe: assume duplicate if DB error
        }
    }
    public static void registerUser(String username, String email, String passwordHash) {
        String sql = "INSERT INTO users (username, email, password_hash) VALUES (?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.setString(3, passwordHash);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("User registered successfully!");
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handles race condition where another insert happened after check
            System.out.println("Email already exists (caught at DB level).");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
