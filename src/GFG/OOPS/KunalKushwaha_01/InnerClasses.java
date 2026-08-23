package GFG.OOPS.KunalKushwaha_01;

import java.util.Arrays;

public class InnerClasses {
    public static class Test{
//      String name;  //Each object gets its own copy of name.
        static String name; //There is only one name variable shared by the entire Test class.
        Test(String name){
//          this.name = name;
            Test.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Aryan");
        Test b = new Test("Harshit");
        System.out.println(a.name); //refer to the same static variable.
        System.out.println(b.name); //refer to the same static variable.

        String str = Arrays.toString(new int[] {3,4,5});
        System.out.println(str);
    }
//*dot operator binds the instance variables/instance methods with the reference variables*//
}
