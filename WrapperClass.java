package OOP;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        swap(a, b);
        System.out.println("a:" + a + ", b:" + b);
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        System.out.println(Arrays.toString(arr));
        trueSwap(arr);
        System.out.println(Arrays.toString(arr));
        final int room = 77;
        // room = 99; Gives an error. "Final": can't be modified!
        final A kunal = new A("Kunal Kushwaha");
        System.out.println(kunal.name);
        kunal.name = "DSAWithKunal";
        System.out.println(kunal.name);
        //kunal = new A("DevopsWithKunal"); Gives Error!
    }
    static void swap(int a, int b){ //PASS BY VALUE.
        int temp = a;
        a = b;
        b = temp;
    }
    static void trueSwap(int [] arr){ //PASS BY REFERENCE.
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
class A{
    final int number = 99;
    String name;
    A(String newName){
        this.name = newName;
    }
}