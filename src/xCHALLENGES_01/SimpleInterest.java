//calculate simple interest
package xCHALLENGES_01;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p = input.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float r = input.nextFloat();
        System.out.print("Enter the time of period in years: ");
        int t = input.nextInt();
        float si = (p*r*t)/100;
        System.out.println("The Simple Interest is: " + si);
//        System.out.printf("The Simple Interest is: %.3f",si);
    }
}
