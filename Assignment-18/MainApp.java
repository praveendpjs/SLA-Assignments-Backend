
public class MainApp {
    public static void main(String[] args) {

        Student s = new Student(1, "Praveen", 88.5);

        StudentDAO dao = new StudentDAOImpl();
        dao.addStudent(s);
    }
}
