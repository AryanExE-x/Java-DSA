package xCHALLENGES_02;
import java.util.Scanner;
public class usingFOR {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=in.nextInt();
        System.out.println("Your number is " + (isPrime(n) ? "Prime" : "Not Prime"));

        }

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
            }
        return true;
        }
    }

