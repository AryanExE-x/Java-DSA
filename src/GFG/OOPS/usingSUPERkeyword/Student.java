package GFG.OOPS.usingSUPERkeyword;

public class Student extends Person{
    double gpa;
    Student(String first, String last, double gpa){
        super(first,last);
        this.gpa=gpa;
    }
    void score(){
        System.out.println(this.gpa);
    }
}
