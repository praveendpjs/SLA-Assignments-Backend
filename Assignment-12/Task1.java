import java.util.HashSet;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
