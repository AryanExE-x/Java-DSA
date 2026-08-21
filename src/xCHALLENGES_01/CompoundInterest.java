//Calculate compound interest

package xCHALLENGES_01;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p = input.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float r = input.nextFloat();
        System.out.print("Enter number of years: ");
        int t = input.nextInt();
        double compoundInterest= p * Math.pow((1+r/100),t);
        System.out.println("The compound interest is: "+compoundInterest);
        float ans= (float)compoundInterest;





    }
}
