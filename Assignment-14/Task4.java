public class Task4 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50}; // size = 5

        try {
            System.out.println(arr[9]); // 10th element (index 9)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}
