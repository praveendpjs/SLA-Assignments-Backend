public class Task1 {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            // Pause the main thread for 3000 milliseconds (3 seconds)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

        System.out.println("Program resumed after 3 seconds");
    }
}
