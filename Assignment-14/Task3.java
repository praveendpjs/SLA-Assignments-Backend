import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class Task3 {
    static void validateAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Employee must be at least 18 years old.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Registration successful.");
        } catch (UnderAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
        sc.close();
    }
}
