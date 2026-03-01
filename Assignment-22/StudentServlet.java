import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        String marksStr = request.getParameter("marks");

        int marks;

        try {
            marks = Integer.parseInt(marksStr);

            if (marks < 0 || marks > 100) {
                request.setAttribute("error", "Marks must be between 0 and 100.");
                request.getRequestDispatcher("form.jsp")
                        .forward(request, response);
                return;
            }

        } catch (NumberFormatException e) {
            request.setAttribute("error", "Marks must be a valid number.");
            request.getRequestDispatcher("form.jsp")
                    .forward(request, response);
            return;
        }

        // Success case
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("course", course);
        request.setAttribute("marks", marks);

        request.getRequestDispatcher("result.jsp")
                .forward(request, response);
    }
}