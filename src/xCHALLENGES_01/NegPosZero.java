//positive negative or zero test

package xCHALLENGES_01;

import java.util.Scanner;

public class NegPosZero {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else System.out.println("The number is zero");

    }
}
