abstract class BankAccount{
    abstract void deposit();
    abstract void withdraw();
}
class SavingsAccount extends BankAccount{
    void deposit(){
        System.out.println("Deposited in savings account");
    }
    void withdraw(){
        System.out.println("Withdrew from savings account");
    }
}
public class AbstractClass3 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit();
        s.withdraw();
    }
}
