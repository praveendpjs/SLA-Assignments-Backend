import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
