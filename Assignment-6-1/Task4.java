import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                count++;
            }
        }
        scan.close();
        System.out.println(count + 1);
    }
}
