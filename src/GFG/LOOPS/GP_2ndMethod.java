package GFG.LOOPS;

import java.util.Scanner;

public class GP_2ndMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* last term = first term x (common ratio)^(n-1) */
        System.out.print("Enter first term (a): ");
        int a = input.nextInt();
        System.out.print("Enter common ratio (r): ");
        int r = input.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = input.nextInt();
        for(int i=a;i<=a*(Math.pow(r,(n-1)));i*=r){
            System.out.printf("%d ",i);
        }
    }
}
