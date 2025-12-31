import java.util.Scanner;
public class PassorFail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        if(marks >= 40){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        scan.close();
    }
}
