import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value is" + min);
        scan.close();
    }
}
