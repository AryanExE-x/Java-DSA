package xUNIT1;

import java.util.Scanner;

class Return {
  public static void main(String[] args){
      int firstNumber= readNumber();
      int secondNumber=readNumber();
      int res= sum(firstNumber,secondNumber);
      System.out.println("The sum is: " + res );


  }

  public static int readNumber(){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num=input.nextInt();
      return num;
  }

  public static int sum(int a,int b){
      int sum;
      sum=a+b;
      return sum;
  }

}
