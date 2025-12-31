import java.util.Scanner;

public class NumberValidation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input;
        do{
            System.out.println("Enter a valid number");
            input = scan.nextLine();
        }while(input.length() != 10);
        scan.close();
    }
}
