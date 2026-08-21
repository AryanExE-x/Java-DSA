package xCHALLENGES_01;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your operator (+,-,*,/) -> " );
        String op=input.next();

        int result = switch(op){
            case "+" -> (num1+num2);
            case "-" -> (num1-num2);
            case "*" -> (num1*num2);
            case "/" -> (num1/num2);
            default -> -1;
        };

        System.out.println("Your answer is: " + result);
    }
}
