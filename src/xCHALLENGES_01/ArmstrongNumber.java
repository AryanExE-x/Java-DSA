package xCHALLENGES_01;
import java.util.Scanner;
public class ArmstrongNumber {   /*153 is an armstrong number 1^2+5^2+3^2=153*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong) System.out.println("The number is an Armstrong number");
        else System.out.println("The number is not an Armstrong number");
    }

    public static boolean isArmstrong(int num){
        int digits= noOfDigits(num);
        int numCopy=num; /*because inside the loop num becomes 0*/
//        System.out.println("Number of digits: " + digits);  /*debugging ke liye*/
        int finalNumber=0;
        while(num>0){
            int lastDigit = num % 10;
            num = num/10;
            finalNumber = finalNumber + power(lastDigit,digits);
        }
//        System.out.println("Final number is: " + finalNumber);  /*debugging ke liye*/
        /*if(finalNumber==numCopy) return true;
        else return false;*/
        return finalNumber == numCopy;
    }

    public static int power(int num1,int num2){
        int result = 1;         // int result=num1; x
        int i=1;               //  i=0; to i<num2
        while(i<=num2){
            result = result * num1;
            i++;
        }
//        System.out.println("Power of " + num1 + " is " + result);  /*debugging ke liye*/
        return result;
    }

    public static int noOfDigits(int num){
        int digits=0;
        while(num>0){
            digits++;
            num = num / 10;
        }
        return digits;
    }

}
