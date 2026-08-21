//SWAP 2 NUMBERS

package xCHALLENGES_01;

import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=num.nextInt();
        System.out.print("Enter second number: ");
        int num2=num.nextInt();
        int temp;  /*by creating a temp variable*/
        temp=num1;
        num1=num2;
        num2= temp;
        System.out.println("The swapped numbers are:-");
        System.out.print(num1+ " and " + num2);


    }
}
