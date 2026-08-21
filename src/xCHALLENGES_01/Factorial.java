package xCHALLENGES_01;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial is: " + fact);
    }

    public static long factorial(int num){

        if(num<2){
            return 1;
        }

        long fact=1;

        /*      int i=2;
        while(i<=num){
            fact=fact*i;
            i++;
        } */

        for(int i=2;i<=num;i++){
            fact=fact*i;
        }

        return fact;
    }
}
