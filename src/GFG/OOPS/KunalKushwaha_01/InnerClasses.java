package GFG.OOPS.KunalKushwaha_01;

public class InnerClasses {
    static class Test{
//        String name;
        static String name;
        Test(String name){
//            this.name = name;
            Test.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Aryan");
        Test b = new Test("Harshit");
        System.out.println(a.name);
        System.out.println(b.name);
    }

}
