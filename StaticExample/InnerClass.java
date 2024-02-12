package OOP.StaticExample;

public class InnerClass {
    static class Test{
        String name;
        int num;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test obj1 = new Test("Kunal");
        Test obj2 = new Test("Harkirat");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        A user = new A();
        user.message();
    }
}

class A{
    static class B{
        public void greeting(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        B user = new B();
        user.greeting();
    }
    void message(){
        System.out.println("Message!");
    }
}





/*
1. Outer classes cannot be static. Inner classes can be static.
2. Inner Classes if present, will be dependent in outer classes.
3. static here refers to that 'Test' class doesn't depend on Inner Class to run.
4. Objects are created during run time.
5. Static variables are initialized when the class is loaded (runtime), before any objects are created.
6. Static inner classes can be accessed directly without creating objects of the outer class.
7. Each class has its own main method, but only the main method in the class being executed will run.
 */