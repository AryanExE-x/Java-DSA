package xCHALLENGES_01;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        int res=sumOfDigits(num);
        System.out.println("The sum of digits is: " + res);

    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num/10;
        }
        return sum;
    }
}
