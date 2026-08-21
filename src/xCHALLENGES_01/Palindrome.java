package xCHALLENGES_01;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome) System.out.println("The number is a palindrome");
        else System.out.println("The number is not a palindrome");
        int rev=reverse(num);
        System.out.println("The reverse of " + num + " is " + rev);
    }

    public static boolean isPalindrome(int num){
        int revNum=reverse(num);
        /*if(num==revNum) return true;
        else return false;*/
        return num==revNum;
    }

    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int lastDigit=num%10;
            newNum=newNum*10+lastDigit;
            num=num/10;
        }
        return newNum;
    }
}
