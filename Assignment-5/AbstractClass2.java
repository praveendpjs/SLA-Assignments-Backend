abstract class Employee{
    int id;
    String name;
    
    abstract int calculateSalary();
}

class FullTimeEmployee extends Employee{
    int hours;
    int pay;
    FullTimeEmployee(int hours, int pay){
        this.hours = hours;
        this.pay = pay;
    }
    int calculateSalary(){
            return hours*pay;
    }
    
}

class PartTimeEmployee extends Employee{
    int hours;
    int pay;
    PartTimeEmployee(int hours, int pay){
        this.hours = hours;
        this.pay = pay;
    }
    int calculateSalary(){
            return hours*pay;
    }
    
}

public class AbstractClass2 {
    public static void main(String[] args) {
        Employee f1 = new FullTimeEmployee(100, 5);
        Employee p1 = new PartTimeEmployee(50, 3);

        System.out.println("Total pay for full time is " + f1.calculateSalary() + "Rs");
        System.out.println("Total pay for part time is " + p1.calculateSalary() + "Rs");
    }
}
