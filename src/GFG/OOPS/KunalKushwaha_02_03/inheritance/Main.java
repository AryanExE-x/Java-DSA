package GFG.OOPS.KunalKushwaha_02_03.inheritance;

public class Main {
    public static void main(String[] args){
        Box box = new Box(4,5,2);
        Box box2 = new Box(box);
        System.out.println(box.l + " " + box.w + " " + box.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        Boxweight box3 = new Boxweight();
        System.out.println(box3.h + " " + box3.weight);
        Boxweight box4 = new Boxweight(2,3,4,5);
        System.out.println(box4.h + " " + box4.weight);

        Box box5 = new Boxweight(2,3,4,5);//* referencing a parent to a child
        System.out.println(box5.w); //but cannot access members of the child class
        //it is the type of the reference variable and not the object which determines
        //which member can be accessed

//!       Boxweight box6 = new Box(2,3,45,5);
        //!error. you are trying to reference a child to a parent
        /*there are many variables in parent and child classes
        you are given access to variables of ref. type - Boxweight
        hence you should have access to weight variable
        this also means that the ones you are trying to access should be initialized
        but here the object itself is of type parent class, how will you call the constructor.
        TODO-> YOU CANNOT HAVE A CHILD REFERENCE VARIABLE AND A PARENT OBJECT

        */
    }
}
