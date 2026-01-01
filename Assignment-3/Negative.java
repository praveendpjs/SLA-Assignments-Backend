import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Negative number");
        }
        scan.close();
    }

}
