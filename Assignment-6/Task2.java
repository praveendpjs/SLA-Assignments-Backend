class Account{
    String accountDetails() {
        return "Premium Account";
    }
}
interface Savings{
    int calculateInterest();
}
interface Current{
    int overdraftLimit();
}

class PremiumAccount extends Account implements Savings, Current{
    public int calculateInterest() {
        int interest = 5000;
        return interest;
    }

    public int overdraftLimit() {
        int limit = 100000;
        return limit;
    }
}
public class Task2 {
    public static void main(String[] args) {
        PremiumAccount account = new PremiumAccount();

        System.out.println("Account Type: " + account.accountDetails());
        System.out.println("Interest Amount: " + account.calculateInterest());
        System.out.println("Overdraft Limit: " + account.overdraftLimit());
    }
}
