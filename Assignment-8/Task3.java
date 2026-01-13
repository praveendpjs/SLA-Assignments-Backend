import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0; 
            for (int j = 0; j < cols; j++) {
                rowSum += matrix1[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }
        sc.close();
    }
}
