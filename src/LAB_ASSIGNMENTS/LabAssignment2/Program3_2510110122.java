package LAB_ASSIGNMENTS.LabAssignment2;

import java.util.Scanner;

public class Program3_2510110122 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total marks of the student out of 100: ");
        int n = input.nextInt();
        if(n>100 || n<0) System.out.println("Enter valid marks obtained");
        if(n>=90) System.out.println("Grade EX");
        else if(n>=80) System.out.println("Grade A");
        else if(n>=70) System.out.println("Grade B");
        else if(n>=60) System.out.println("Grade C");
        else if(n>=50) System.out.println("Grade D");
        else if(n>=35) System.out.println("Grade E");
        else System.out.println("Grade F");
    }
}
