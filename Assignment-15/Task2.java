class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second after each number
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted");
                break; // Exit if interrupted
            }
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        NumberPrinter child = new NumberPrinter();
        child.start(); // Start child thread

        System.out.println("Main thread finished");
    }
}
