import java.sql.*;
import java.util.*;

public class StudentDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/jdbc";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";

    private static final String INSERT_SQL =
        "INSERT INTO Student (name, email, course) VALUES (?, ?, ?)";
    private static final String SELECT_ALL_SQL =
        "SELECT * FROM Student";
    private static final String SELECT_BY_ID_SQL =
        "SELECT * FROM Student WHERE id = ?";
    private static final String UPDATE_SQL =
        "UPDATE Student SET name=?, email=?, course=? WHERE id=?";
    private static final String DELETE_SQL =
        "DELETE FROM Student WHERE id=?";

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public void insertStudent(Student student) throws SQLException {
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(INSERT_SQL)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());
            ps.executeUpdate();
        }
    }

    public List<Student> selectAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(SELECT_ALL_SQL);
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                students.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("course")
                ));
            }
        }
        return students;
    }

    public Student selectStudent(int id) throws SQLException {
        Student student = null;
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(SELECT_BY_ID_SQL)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                student = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("course")
                );
            }
        }
        return student;
    }

    public void updateStudent(Student student) throws SQLException {
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(UPDATE_SQL)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());
            ps.setInt(4, student.getId());
            ps.executeUpdate();
        }
    }

    public void deleteStudent(int id) throws SQLException {
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(DELETE_SQL)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}