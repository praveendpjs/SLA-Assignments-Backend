import java.util.Scanner;

public class SalaryUpdate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        // Using +=
        salary+=1000;
        System.out.println("Salary is incremented 1000RS : " + salary);

        // Using -=
        salary-=1000;
        System.out.println("Salary is decremented 1000RS : " + salary);

        // Using *=
        salary*=1.1;
        System.out.println("Salary is incremented 10% : " + salary);

        // Using /=
        salary/=10;
        System.out.println("Salary is divided by 10 : " + salary);

        scan.close();
    }
}
