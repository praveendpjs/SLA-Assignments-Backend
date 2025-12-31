import java.util.Scanner;
public class AtmPin {
    public static void main(String[] args){
        int pin = 1212;
        System.out.println("Enter your pin number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while (input != pin) {
            System.out.println("Retry wrong input");
            input = scan.nextInt();
        }
        System.out.println("Yay right pin!");
        scan.close();
    }
}
