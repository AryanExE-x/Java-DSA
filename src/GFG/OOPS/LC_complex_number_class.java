package GFG.OOPS;
public class LC_complex_number_class {
    static class ComplexNumber{
        int x;
        int y;
        ComplexNumber(int x, int y){
            this.x = x;
            this.y = y;
        }

        static void greet(){
            System.out.println("Inside the Complex number innerclass");
        }

        void print(){
            if(y>=0)  System.out.println(x + " + " + y + "i");
            else System.out.println(x + " - " + (-y) + "i");
        }

        void add(ComplexNumber z){
            this.x+=z.x;
            this.y+=z.y;
        }
        void multiply(ComplexNumber z){
            this.x=x*z.x - y*z.y;
            this.y+=x*z.y + y*z.x;
        }

    }
    static void greet(){
        System.out.println("Outside the innerclass");
    }
    public static void main(String[] args){
        ComplexNumber z1 = new ComplexNumber(2,5);
        ComplexNumber z2 = new ComplexNumber(3,-4);
        System.out.println("z1");
        z1.print();
        System.out.println("z2");
        z2.print();
        z1.add(z2);
        System.out.println("z1=z1+z2");
        System.out.println("z1");
        z1.print();
        System.out.println("z2. it will have no changes since we have added z2 into z1");
        z2.print();

        z1.multiply(z2);
        System.out.println("z1=z1 x z2");
        System.out.println("z1");
        z1.print();
        System.out.println("z2 will have no changes since we have multiplied z2 into z1");
        z2.print();

        LC_complex_number_class.ComplexNumber.greet();

        greet();
    }

}
