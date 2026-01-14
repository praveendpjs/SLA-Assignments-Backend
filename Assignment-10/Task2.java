import java.util.Arrays;
public class Task2 {

public class RightRotateNaive {

    public static void rightRotateArrayNaive(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            rotateArrayOnce(arr);
        }
    }

    public static void rotateArrayOnce(int[] arr) {
        int n = arr.length;
        int lastElement = arr[n - 1]; 

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("After Right Rotation " + k + " times: " + Arrays.toString(array));


        rightRotateArrayNaive(array, k);
        
    }
}
}
