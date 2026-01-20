import java.util.HashSet;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();

        list.add(101);
        list.add(102);
        list.add(103);
        list.add(101);
        list.add(102);
        list.add(105);
        list.add(109);
        list.add(105);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
