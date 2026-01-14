import java.util.Arrays;

public class Task3 {
    public static int[] rightRotate(int arr[], int k) {
        int n = arr.length;
        int[] newArr = new int[n];
        k = k % n;
        int index = 0;
        for (int i = n - k; i < n; i++) {
            newArr[index] = arr[i];
            index++;
        }
        for (int i = 0; i < n - k; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

    public static int[] leftRotate(int arr[], int k) {
        int n = arr.length;
        int[] newArr = new int[n];
        k = k % n;
        int index = 0;
        for (int i = k; i < n; i++) {
            newArr[index] = arr[i];
            index++;
        }
        for (int i = 0; i < k; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        arr1 = rightRotate(arr1, k);
        System.out.println(Arrays.toString(arr1));
        arr2 = leftRotate(arr2, k);
        System.out.println(Arrays.toString(arr2));
    }
}