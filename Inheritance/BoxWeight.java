package OOP.Inheritance;

public class BoxWeight extends Box {
    double wt;
    BoxWeight(){
        this.wt = -1;
    }
    BoxWeight(double l, double w, double h, double wt){
        super(l,w,h); // This is calling the parent class constructor.
        this.wt = wt;
    }
}
