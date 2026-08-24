package GFG.OOPS.KK_02_03.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(double h, double w, double l){
        this.h = h;
        this.w = w;
        this.l = l;
    }
    Box(Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
