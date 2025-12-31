import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();
        if(username.equals("admin") && password.equals("admin123")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Credentials");
        }
        scan.close();
    }
}
