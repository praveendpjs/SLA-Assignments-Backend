import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a strong password with length greater than 8");
        String password = scan.nextLine();
        while(password.length() < 8){
            System.out.println("Password is too short. Re-enter password");
            password = scan.nextLine();
        }
        System.out.println("Password accepted!");
        scan.close();
    }
}
