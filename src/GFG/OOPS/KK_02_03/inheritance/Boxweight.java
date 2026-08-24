package GFG.OOPS.KK_02_03.inheritance;

public class Boxweight extends Box {
    double weight;
    Boxweight(){
        super();
        this.weight=0;
    }
    Boxweight(Boxweight other){
        super(other);
        this.weight=other.weight;
    }

    Boxweight(double weight){
        this.weight=weight;
    }
    Boxweight(double l, double h, double w, double weight){
        //used to initialize values present in the parent class
        super(l,h,w); //call the parent class constructor
        this.weight=weight;
        System.out.println(super.l + " " + super.w + " " + super.h + " " + this.weight);
    }
    Boxweight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
