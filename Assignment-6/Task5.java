interface Auditable {
    void auditLog();
}

class User {
    void login() {
        System.out.println("User logged in");
    }

    String accessLevel() {
        return "Basic User";
    }
}

class Admin extends User implements Auditable {

    String accessLevel() {
        return "Full Admin Access";
    }

    public void auditLog() {
        System.out.println("Admin actions audited");
    }
}

class Seller extends User {

    String accessLevel() {
        return "Seller Dashboard Access";
    }
}

// Child class 3
class Customer extends User {

    String accessLevel() {
        return "Customer Shopping Access";
    }
}
public class Task5 {
    public static void main(String[] args) {
        User admin = new Admin();
        User seller = new Seller();
        User customer = new Customer();

        System.out.println(admin.accessLevel());
        System.out.println(seller.accessLevel());
        System.out.println(customer.accessLevel());

        ((Admin) admin).auditLog(); // hybrid behavior
    }
}
