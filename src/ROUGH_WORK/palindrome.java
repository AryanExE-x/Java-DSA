package ROUGH_WORK;
import java.util.Scanner;

public class palindrome {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("EEnter a number: ");
        int num= input.nextInt();
        boolean isPalindrome=(isPalindrome(num));
        if(isPalindrome){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
        System.out.println();
        int rev=reverse(num);
        System.out.println("The reverse of the number is: " + rev);
        System.out.println();
        int significantD=significantDigit(num);
        System.out.println("The significant Digits of the number is: " + significantD);
    }
    public static boolean isPalindrome(int num){
        int reverseNum=reverse(num);
        return (reverseNum==num);
    }
    public static int significantDigit(int num){
        int sig=0;
        while(num>0){
            int lastDigit=num%10;
            sig=lastDigit;
            num=num/10;

        }
        return sig;
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

