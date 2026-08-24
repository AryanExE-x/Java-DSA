package GFG.OOPS.KK_02_03.polymorphism;

public class Circle extends Shapes {

    //this will run when the obj of circle is created
    //hence it is overriding the parent method.
    @Override //this is called annotation
    void area(){
        System.out.println("area of circle is pi*r*r");
    }
}
