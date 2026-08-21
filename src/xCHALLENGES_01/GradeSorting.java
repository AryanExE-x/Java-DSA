//GRADE CALCULATOR

package xCHALLENGES_01;

import java.util.Scanner;

public class GradeSorting {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your marks in % : ");
        int marks=input.nextInt();

        if (marks>=90) System.out.println("Grade A");
        else if (marks>=80) System.out.println("Grade A-");
        else if (marks>=75) System.out.println("B");
        else if (marks>=50) System.out.println("C");
        else if (marks>=40) System.out.println("D");
        else System.out.println("FAIL");
    }
}
