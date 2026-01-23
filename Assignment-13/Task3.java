import java.util.ArrayDeque;
import java.util.Deque;

public class Task3 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(20);

        dq.addLast(30);
        dq.addLast(40);

        System.out.println(dq);
    }
}
