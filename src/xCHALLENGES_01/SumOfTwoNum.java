//SUM OF TWO NUMBERS
package xCHALLENGES_01;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args){

    Scanner number= new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1=number.nextInt();
    System.out.print("Enter the second number: ");
    int num2=number.nextInt();
    int sum=num1+num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
