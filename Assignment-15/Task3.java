class SharedResource {
    public synchronized void criticalSection(String threadName) {
        System.out.println(threadName + " entered critical section");

        try {
            // Thread goes to sleep BUT still holds the lock
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(threadName + " was interrupted");
        }

        System.out.println(threadName + " leaving critical section");
    }
}
public class Task3 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.criticalSection("Thread-1"));
        Thread t2 = new Thread(() -> resource.criticalSection("Thread-2"));

        t1.start();
        t2.start();
    }
}
