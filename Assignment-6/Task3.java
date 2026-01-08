class User{
    void login(){
        System.out.println("You are logged in");
    }
}
class Admin extends User{
    void manageUsers(){
        System.out.println("Users are managed");
    }
}
class Manager extends User{
    void manageTeam(){
        System.out.println("Team members are managed");
    }
}
class Customer extends User{
    void placeOrder(){
        System.out.println("Order has been placed");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.login();        
        admin.manageUsers(); 

        Manager manager = new Manager();
        manager.login();      
        manager.manageTeam(); 

        Customer customer = new Customer();
        customer.login();     
        customer.placeOrder();
    }
}
