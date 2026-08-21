package xCHALLENGES_01;

import java.util.Scanner;

public class StudentScoreTernary {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Score: ");
        int marks = input.nextInt();

        /*Nested Ternary Operator*/

        String category = (marks >= 80) ? "High" : ((marks >= 50) ? "Moderate" : "Low");

        System.out.println("Your Category is " + category);


    }

}
