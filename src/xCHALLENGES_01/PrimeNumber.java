package xCHALLENGES_01;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        boolean Prime=isPrime(num);
        if(Prime) System.out.println("The number is Prime number");
        else System.out.println("The number is not a Prime number");
    }

    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}