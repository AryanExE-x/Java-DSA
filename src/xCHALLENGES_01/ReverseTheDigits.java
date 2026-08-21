package xCHALLENGES_01;

import java.util.Scanner;

public class ReverseTheDigits {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        int ans=reverseDigits(num);
        System.out.println("The reverse digits of the num : " + ans );
    }

    public static int reverseDigits(int num){
        int rev = 0;
        while (num > 0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num/10;
        }
        return rev;
    }
}
