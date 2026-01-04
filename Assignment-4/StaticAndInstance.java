class Counter{
    static int staticCount = 0;
    int instanceCount = 0;

    Counter(){
        staticCount++;
        instanceCount++;
    }
    void show(){
        System.out.println("staticCount = " + staticCount + ", instanceCount = " + instanceCount);
    }
}
public class StaticAndInstance {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c1.show();
        c2.show();
        c3.show();
    }
}
