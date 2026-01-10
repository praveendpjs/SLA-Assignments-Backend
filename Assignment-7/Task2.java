
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-9,4,7,-10};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
