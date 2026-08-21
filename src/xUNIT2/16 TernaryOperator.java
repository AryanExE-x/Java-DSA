package xUNIT2;

import java.util.Scanner;

class TernaryOperator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Ternary Operator Program\n");
      System.out.print("Enter first number: ");
      int num1 = input.nextInt();
      System.out.print("Now Enter second number: ");
      int num2 = input.nextInt();

//      int greaterNum;
//      if(num1>num2) greaterNum=num1;
//      else greaterNum=num2;
//      System.out.println(greaterNum + " is the greater number.");
//      int greaterNum = Math.max(num1, num2);

       int greaterNum;
       greaterNum = (num1>num2) ? num1 : num2;
       System.out.println(greaterNum + " is the greater number.");




   }
}
