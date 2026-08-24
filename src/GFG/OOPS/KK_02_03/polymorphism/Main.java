package GFG.OOPS.KK_02_03.polymorphism;

public class Main {
    public static void main(String[] args){
    Shapes shape = new Shapes();
    Circle circle = new Circle();

    //type of ref variable is the parent class. and the object is of the type of subclass.
    //here which method will be called depends on the type of child.
//        THIS IS KNOWN AS UPCASTING. AND THIS ENTIRE THING IS KNOWN AS HOW OVERRIDING HAPPENS
    Shapes circle2 = new Circle();

    Square square = new Square();
    shape.area();
    circle.area();
    circle2.area();
    square.area();
    }


}
