import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount you want: ");
        int amount = scan.nextInt();
        int available = 1000;
        try {
            if (amount <= available) {
                System.out.println("Here is your amount " + amount + " withdrawn successfully");
            } else {
                System.out.println("The amount exceeded your balance");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }
        scan.close();
    }
}
