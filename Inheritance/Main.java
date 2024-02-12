package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        Box box1 = new Box();
        Box box2 = new Box(5.7);
        Box box3 = new Box(0.998,8.78, 66.78);
        Box box4 = new Box(box3);
        obj.printDimensions(box1);
        obj.printDimensions(box2);
        obj.printDimensions(box3);
        obj.printDimensions(box4);

        BoxWeight bw1 = new BoxWeight(11.09,3.000756,21,6);
        BoxWeight bw2 = new BoxWeight();
        obj.printDimensions(bw1);
        obj.printDimensions(bw2);
    }
    public void printDimensions(Box b){
        System.out.println("Length: " + b.l + ", Width: " + b.w + ", Height: " + b.h);
    }
    public void printDimensions(BoxWeight b){
        System.out.println("Length: " + b.l + ", Width: " + b.w + ", Height: " + b.h+ ", Weight: " +b.wt);
    }
}
