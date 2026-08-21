package xCHALLENGES_01;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first=input.nextInt();
        System.out.print("Enter second number: ");
        int second=input.nextInt();
        int ans=gcd(first,second);
        System.out.println("The GCD of the numbers is: " + ans);
    }

    public static int gcd(int first,int second){
        int gcd=1;
        int i=2;
        int least= min(first,second);
        while(i<=least){
            if(first % i ==0 && second % i ==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }

    public static int min(int first, int second){
        /*if (first<second) return first;
          else return second;*/
          return Math.min(first,second);
    }
}
