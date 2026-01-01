
public class SwapVariables {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial a value: "+a);
        int b = 20;
        System.out.println("Initial b value: "+b);
        a = a + b;
        b = a - b;
        System.out.println("Final b value: "+b);
        a = a - b;
        System.out.println("Final a value: "+a);
    }
}
