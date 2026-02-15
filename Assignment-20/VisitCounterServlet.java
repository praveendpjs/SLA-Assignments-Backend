import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VisitCounterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int visitCount = 0;
        boolean found = false;

        // Get existing cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(cookie.getValue());
                    visitCount++;
                    cookie.setValue(String.valueOf(visitCount));
                    response.addCookie(cookie);
                    found = true;
                    break;
                }
            }
        }

        // If cookie not found, create new
        if (!found) {
            visitCount = 1;
            Cookie newCookie = new Cookie("visitCount", String.valueOf(visitCount));
            newCookie.setMaxAge(60 * 60 * 24 * 7); 
            response.addCookie(newCookie);
        }

        out.println("<html><body>");
        out.println("<h2>You have visited this page " + visitCount + " times.</h2>");
        out.println("</body></html>");
    }
}
