package xCHALLENGES_01;

import java.util.Scanner;

public class EvenOddTernaryStaticFunction {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=input.nextInt();


        String evenOdd = evenOdd(num);
        System.out.println("The number is " + evenOdd);

    }

    public static String evenOdd(int num){
        return (num%2==0) ? "Even" : "Odd";
    }


}
