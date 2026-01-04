class Counter{
    static int staticCount = 0;
    int instanceCount = 0;
    void method(){
        int localCount = 0;
        staticCount++;
        instanceCount++;
        localCount++;
        System.out.println("staticCount = " + staticCount + ", instanceCount = " + instanceCount + ", localCount = " + localCount);
    }
}
public class StaticLocal {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.method();
        c2.method();
        c1.method();
    }
}
