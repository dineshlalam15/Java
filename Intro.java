package OOP;

public class Intro {
    public static void main(String[] args) {
        Student [] students = new Student[5];
        Student dinesh = new Student(9,"Dinesh",99);
        System.out.println(dinesh.name);
        System.out.println(dinesh.rollNo);
        System.out.println(dinesh.marks);
        dinesh.greeting();
        dinesh.changeName("Dinesh Lalam");
        dinesh.greeting();
        Student ramesh = new Student();
        Student otherStudent = new Student(ramesh);
        System.out.println(ramesh.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);
    }
}
class Student{
    String name;
    int rollNo;
    int marks = 78;
    Student(){
        // This is how you call one constructor from another constructor.
        // Internally it's Student(77, "Dinesh Kumar Lalam", 91);
        this(77, "Dinesh Kumar Lalam", 91);
    }
    Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }
    void greeting(){
        System.out.println("Hello. I'm " +this.name);
    }
    void changeName(String newName){
        this.name = newName;
    }
    Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}