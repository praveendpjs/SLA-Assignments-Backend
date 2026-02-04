import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; 

    @Override
    public void addStudent(Student s) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement ps = con.prepareStatement("INSERT INTO student (id, name, marks) VALUES (?, ?, ?)")) {

                ps.setInt(1, s.getId());
                ps.setString(2, s.getName());
                ps.setDouble(3, s.getMarks());

                int rows = ps.executeUpdate();
                System.out.println(rows + " student inserted successfully!");

            }

        } catch (SQLException e) {
            System.out.println("Database error occurred");
            e.printStackTrace();
        }
    }
}
