package GFG.OOPS.KunalKushwaha_02_03.inheritance;

import java.sql.SQLOutput;

public class Boxweight extends Box {
    double weight;
    Boxweight(){
        this.weight=0;
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
}
