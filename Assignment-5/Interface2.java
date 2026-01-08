interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionDevice implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        MultiFunctionDevice device = new MultiFunctionDevice();
        device.print();
        device.scan();
    }
}
