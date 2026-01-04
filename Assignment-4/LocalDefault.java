class Demo{
    int y;
    Demo(){
        System.out.println(y);
    }
    void localMethod(){
        int x;
        // System.out.println("Cannot print x" + x);
    }
}
public class LocalDefault {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        
    }
}
