@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    private StudentDAO studentDAO;

    public void init() {
        studentDAO = new StudentDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        try {
            if (action == null) {
                listStudents(request, response);
            } else {
                switch (action) {
                    case "new":
                        request.getRequestDispatcher("addStudent.jsp").forward(request, response);
                        break;
                    case "edit":
                        showEditForm(request, response);
                        break;
                    case "delete":
                        deleteStudent(request, response);
                        break;
                    default:
                        listStudents(request, response);
                }
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        try {
            if (id == null || id.isEmpty()) {
                insertStudent(request, response);
            } else {
                updateStudent(request, response);
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    private void insertStudent(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Student student = new Student(
                request.getParameter("name"),
                request.getParameter("email"),
                request.getParameter("course")
        );

        studentDAO.insertStudent(student);
        response.sendRedirect("student");
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Student student = new Student(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("name"),
                request.getParameter("email"),
                request.getParameter("course")
        );

        studentDAO.updateStudent(student);
        response.sendRedirect("student");
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        int id = Integer.parseInt(request.getParameter("id"));
        studentDAO.deleteStudent(id);
        response.sendRedirect("student");
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentDAO.selectStudent(id);
        request.setAttribute("student", student);
        request.getRequestDispatcher("editStudent.jsp").forward(request, response);
    }

    private void listStudents(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        request.setAttribute("listStudent", studentDAO.selectAllStudents());
        request.getRequestDispatcher("listStudent.jsp").forward(request, response);
    }
}