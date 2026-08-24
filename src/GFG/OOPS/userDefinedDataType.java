package GFG.OOPS;
/*yaha class ke upar bhi define kar skte ho data type aur andar bhi file ke*/
//it can be accessed anywhere under package OOPS
class Student{  //data type.
    String name;
    int roll;
    double cgpa;
    void print(){
        System.out.println(name+" "+roll+" "+cgpa);
    }
}

public class userDefinedDataType {

    /*
    * YAHA BHI KR SKTE HO DEFINE class Student ko
    */

    public static void main(String[] args){
        Student s1= new Student(); //declaration. new object
        s1.name="Aryan"; /*attributes*/
        s1.roll=1; /*attributes*/
        s1.cgpa=9.02; /*attributes*/

        Student s2= new Student(); //declaration. new object
        s2.name="Ekansh";
        s2.roll=2;
        s2.cgpa=9.99;

        Student s3= new Student(); //declaration. new object
        s3.name="Abhinav";
        s3.roll=1;
        s3.cgpa=9.7;

        System.out.println(s1.name);
        s1.cgpa=10;
        System.out.println(s1.cgpa);

        System.out.println("\n");
        s1.print();
        s2.print();
        s3.print();
        System.out.println("\n");

    }
}
