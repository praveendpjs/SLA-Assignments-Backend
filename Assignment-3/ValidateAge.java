import java.util.Scanner;

public class ValidateAge {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int age = scan.nextInt();
        if(age >= 18 && age <=60){
            System.out.println("Your age is valid");
        }else{
            System.out.println("Invalid age");
        }
        scan.close();
    }
    
}
