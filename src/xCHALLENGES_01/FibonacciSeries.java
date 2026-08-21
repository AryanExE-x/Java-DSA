package xCHALLENGES_01;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.println("The Fibonacci Series upto " + num + " is:- " );
        fibonacci(num);
    }

    //0 1 1 2 3 5 8 13 21 34 55 89

    public static void fibonacci(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while(first + second <= num){
            int third= first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }
}
