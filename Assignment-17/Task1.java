import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Task1 {
    public static void main(String[] args) {
        
    
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            CallableStatement cs = con.prepareCall("{call addStudent(?, ?, ?)}");

            cs.setInt(1, 101);
            cs.setString(2, "Praveen");
            cs.setInt(3, 88);

            cs.execute();

            System.out.println("Student record inserted successfully.");

            cs.close();
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
