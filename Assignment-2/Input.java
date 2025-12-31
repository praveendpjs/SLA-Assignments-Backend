import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input;
        do{
            System.out.println("Do you want to continue y or n");
            input = scan.nextLine();
        }while(input.equals("y"));
        scan.close();
    }
    
}
