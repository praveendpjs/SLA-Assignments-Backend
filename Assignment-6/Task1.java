class Employee{
    void work(){
        System.out.println("Work is going on...");
    }
}

interface Developer  {

    void develop();
}

interface Tester  {

    void test();
}

class TeamLead extends Employee implements Developer, Tester{

    public void develop() {
        System.out.println("TeamLead is developing");
    }


    public void test() {
        System.out.println("TeamLead is testing");
    }
}
public class Task1 {
    public static void main(String[] args) {
        TeamLead lead = new TeamLead();

        lead.work();    
        lead.develop(); 
        lead.test();     
    }
}
