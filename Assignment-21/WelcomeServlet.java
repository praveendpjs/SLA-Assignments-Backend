import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

// @WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session != null) {

            String username =
            (String) session.getAttribute("username");

            if (username != null) {

                out.println("<h1>Welcome " + username + "</h1>");

                out.println("<a href='LogoutServlet'>Logout</a>");

            } else {

                response.sendRedirect("login.html");
            }

        } else {

            response.sendRedirect("login.html");
        }
    }
}