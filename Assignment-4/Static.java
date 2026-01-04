class StaticVariable{
    static String name = "I am a static variable";
    String Notname = "I am a non-static variable";
}
public class Static {
    public static void main(String[] args) {
        System.out.println(StaticVariable.name);
        StaticVariable obj = new StaticVariable();
        System.out.println(obj.Notname);
    }
}
