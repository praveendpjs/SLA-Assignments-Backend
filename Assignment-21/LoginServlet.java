import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    protected void doPost(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    URL, DB_USER, DB_PASSWORD);

            String sql = "SELECT * FROM student WHERE username=? AND password=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<h2>Login Success</h2>");
            } else {
                out.println("<h2>Invalid Login</h2>");
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Error occurred</h2>");
        }
    }
}