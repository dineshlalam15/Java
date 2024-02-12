package OOP.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human dinesh = new Human(21,"Dinesh","Male",63000);
        Human bhukta = new Human(20,"Bhukta","Male",52000);
        Human govardhan = new Human(20,"Govardhan","Male",60000);
        System.out.println(dinesh.name);
        System.out.println(bhukta.salary);
        System.out.println(govardhan.gender);
        System.out.println(Human.population);
        // System.out.println(bhukta.population);
    }

    void greeting(){

        System.out.println("Hello");
    }

    static void normal(){
        Main object = new Main();
        object.greeting();
    }
}

