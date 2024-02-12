package OOP.StaticExample;

public class Human {
    int age;
    String name;
    String gender;
    int salary;
    static long population;
    public Human(int age, String name, String gender, int salary){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        Human.population += 1;
    }

}
