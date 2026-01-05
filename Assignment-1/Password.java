import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if(password.length() < 8){
            System.out.println("Weak password");
        }else {
            System.out.println("Strong password");
        }
        scan.close();

    }
}
