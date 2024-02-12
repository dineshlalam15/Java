package OOP.StaticExample;

public class StaticBlock {
    static int a = 7;
    static int b;
    static {
        System.out.println("I'm static block");
        b = a * 5;
    }
    public static void main(String[] args) {
        System.out.println(a + " " + b);
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
