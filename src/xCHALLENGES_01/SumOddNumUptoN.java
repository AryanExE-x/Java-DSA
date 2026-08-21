package xCHALLENGES_01;

import java.util.Scanner;

public class SumOddNumUptoN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=input.nextInt();
        int sum= oddSum(num);
        System.out.println("Sum of odd numbers till " + num + " is " + sum);
    }

    public static int oddSum(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;   //sum=sum+i
            i+=2;     //i=i+2
        }
        return sum;
    }


}
