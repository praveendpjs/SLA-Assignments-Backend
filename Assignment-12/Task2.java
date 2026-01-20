import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.addFirst(1);
        list.addLast(100);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
