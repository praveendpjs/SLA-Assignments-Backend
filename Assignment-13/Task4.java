import java.util.ArrayDeque;
import java.util.Deque;

public class Task4 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(20);

        dq.addLast(30);
        dq.addLast(40);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);
    }
}
