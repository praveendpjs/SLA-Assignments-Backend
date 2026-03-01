import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Demo credentials (DO NOT do this in real systems)
        if ("admin".equals(username) && "1234".equals(password)) {

            // Create session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            request.getRequestDispatcher("dashboard.jsp")
                   .forward(request, response);

        } else {

            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("login.jsp")
                   .forward(request, response);
        }
    }
}