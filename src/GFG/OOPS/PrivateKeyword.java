package GFG.OOPS;

class Students{
    String name; //default value - null
    private int roll; //default value - 0
    double cgpa; //default value -0.0
    void print(){ /*getter*/
        System.out.println(name+" "+roll+" "+cgpa);
    }

    int getRollNo(){  /*getter*/
        return roll;
    }

    void setRollNo(int x){ /*setter*/
        roll=x;
    }

}
public class PrivateKeyword {

    public static void main(String[] args){
        Students s1 = new Students();
        s1.cgpa=10;
        s1.name="Ekansh Scammer Jain";
        s1.print();
        System.out.println(s1.getRollNo());
        s1.setRollNo(10);
        System.out.println(s1.getRollNo());
    }
}
