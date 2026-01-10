import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < size; i++){
            System.out.print(" "+ arr[i]);
        }
        scan.close();
    }
}
