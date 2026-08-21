package xCHALLENGES_01;

import java.util.Scanner;

public class MinimumUsingTernaryOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=input.nextInt();
        System.out.print("Enter second number: ");
        int num2=input.nextInt();

        /*OOPS CONCEPT*/

        MinimumUsingTernaryOP ternaryOP = new MinimumUsingTernaryOP();
        int min=ternaryOP.min(num1,num2);
        System.out.println(min + " is the minimum number among the two numbers");

    }

        public int min(int num1,int num2){
            return (num1<num2) ? num1 : num2;
        }


}
