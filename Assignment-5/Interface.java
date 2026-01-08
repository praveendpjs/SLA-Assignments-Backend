interface Payment {
    void pay(int amount);
}

class CreditCardPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
public class Interface{
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay(1200);

        Payment p2 = new UPIPayment();
        p2.pay(750);
    }
}