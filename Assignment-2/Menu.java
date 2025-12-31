import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input;
        int count = 0;
        do{
            System.out.println("Enter 1 to Add  | Enter 2 to Sub | Enter 3 to Exit");
            input = scan.nextInt();
            if(input == 1){
                count++;
                System.out.println("Added!");
            }else if(input ==2){
                count--;
                System.out.println("Subed!");
            }
        }while(input != 3);
        System.out.println("This is the final count "+ count);
        scan.close();
    }
}
