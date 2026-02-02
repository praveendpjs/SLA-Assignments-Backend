import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Task2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            CallableStatement cs = con.prepareCall("{call getStudentById(?)}");

            cs.setInt(1, 101);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
            }

            rs.close();
            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
