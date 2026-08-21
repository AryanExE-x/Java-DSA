package xUNIT2;

//*MATH FUNCTIONS -> math methods are static methods and can be accessed directly
/*abs() absolute value*/
/*ceil() rounds up the value-> badha dega*/
/*floor() rounds down the value-> kam kardega*/
/*round() rounds to nearest integer*/
/*max(),min() max and min of two numbers*/
/*pow() power calculation*/
/*sqrt() square root*/
//*random()  /*random number generation*/
/*exp() log()*/
/*sin(),cos(),tan() trigo functions*/

import java.util.Scanner;
class RandMath {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(Math.abs(-12));
        System.out.println(Math.ceil(8.07));
        System.out.println(Math.floor(8.07));
        System.out.println(Math.round(8.07));
        System.out.println(Math.round(8.77));
        System.out.println(Math.round(8.49));
        System.out.println(Math.round(8.5));
        System.out.println(Math.max(2,3));
        System.out.println((int)Math.pow(2,3));
        System.out.println(Math.random());  /*number between [0.0 to 1.0]*/
        System.out.println(Math.random()*10);
        int random =(int)Math.round(Math.random()*100);
        System.out.println(random);
        System.out.println(Math.PI);
        System.out.println(Math.E);

    }
}
