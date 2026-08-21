package ROUGH_WORK;
import java.util.Scanner;
public class sumOfDigits {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur number: ");
        int num=input.nextInt();
        int sumofdig=sum(num);
        int reverseofdig=reverse(num);
        System.out.printf("The sum of digits of %d is: %d",num,sumofdig);
        System.out.println( );
        System.out.printf("The reverse of digits of %d is: %d",num,reverseofdig);
    }
    public static int sum(int num){
        int sumofdigits=0;
        int lastDigit=0;
        while(num>0){
            lastDigit=num%10;  /*last digit nikaalna hai*/
            sumofdigits=sumofdigits+lastDigit; /*sum karna hai last digits ka*/
            num=num/10;  /*number ka last digit khatam karna h*/
        }
        return sumofdigits;
    }

    public static int reverse(int num){
        int rev=0;
        int lastDigit=0;
        while(num>0){  /*while(num!=0) bhi likh skte ho*/
            lastDigit=num%10;  /*last digit*/
            rev=rev*10; /*10 se multiply hoke add krte jao last digit ko*/
            rev=rev+lastDigit; /*reverse mein likhte jao*/
            num=num/10; /*same number ka last digit khatam krna h*/
        }
        return rev;
    }
}
