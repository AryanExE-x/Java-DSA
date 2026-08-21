package xUNIT1;

import java.util.Scanner;

class Arithmetic {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter first integer: ");
   int a=input.nextInt();
   System.out.print("Enter second integer: ");
   int b=(new Scanner(System.in)).nextInt();
   System.out.println(a+b);
   System.out.println(a-b);
   System.out.println(a*b);
   System.out.println(a/b);
   System.out.println(a%b);

   System.out.println("--------------");

   System.out.print("Enter first floating point: ");
   float x=input.nextInt();
   System.out.print("Enter second floating point: ");
   float y=input.nextInt();
   System.out.println(x+y);
   System.out.println(x-y);
   System.out.println(x*y);
   System.out.println(x/y);
   System.out.println(x%y);

   System.out.println("--------------");

   System.out.print("Enter first double number: ");
   double d1=input.nextInt();
   System.out.print("Enter second double number: ");
   double d2=input.nextInt();
   System.out.println(d1+d2);
   System.out.println(d1-d2);
   System.out.println(d1*d2);
   System.out.println(d1/d2);
   System.out.println(d1%d2);



  }
}
