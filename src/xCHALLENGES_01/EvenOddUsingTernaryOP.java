package xCHALLENGES_01;

import java.util.Scanner;

public class EvenOddUsingTernaryOP {
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=input.nextInt();

        EvenOddUsingTernaryOP evenOddUsingTernaryOP = new EvenOddUsingTernaryOP();
        String evenOdd = evenOddUsingTernaryOP.evenOdd(num);
        System.out.println("The number is " + evenOdd);

    }

    public String evenOdd(int num){
        return (num%2==0) ? "Even" : "Odd";
    }


}
