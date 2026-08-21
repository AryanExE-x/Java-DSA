package GFG.OOPS;

class Fraction {
    int num;
    int den;

    Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        simplify();
    }

    void print() {
        System.out.println(num + "/" + den);

    }

    void add(Fraction f) { /*lcm method se fraction ko add krdiya ezpz*/
        this.num = num * f.den + den * f.num;
        this.den = den * f.den;
        simplify();
    }

    void multiply(Fraction f) {
        this.num = this.num * f.num;
        this.den = this.den * f.den;
        simplify();
    }

    void divide(Fraction f) {
        this.num = num * f.den;
        this.den = den * f.num;
        simplify();
    }

    void simplify() {
        boolean isNegative = (num * den < 0) ? true : false;
        this.num = Math.abs(num);
        this.den = Math.abs(den);
        int gcd = hcf(num, den);
        int newNum = num / gcd;
        int newDen = den / gcd;
        this.num = newNum;
        this.den = newDen;
        if (isNegative) {
            this.num = -(num);
        }

    }

    int hcf(int a, int b) {
        if (a == 0) return b;
        return hcf(b % a, a);
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, -7);
        f1.print();
        Fraction f2 = new Fraction(7, 3);
        f1.add(f2);
        System.out.print("Add ");
        f2.print();
        System.out.print("= ");
        f1.print();

        f1.multiply(f2);
        System.out.print("Multiply ");
        f2.print();
        System.out.print("= ");
        f1.print();
        Fraction f3 = new Fraction(-50, 100);
        f3.print();
    }
}
