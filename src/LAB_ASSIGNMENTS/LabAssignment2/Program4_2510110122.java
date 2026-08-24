package LAB_ASSIGNMENTS.LabAssignment2;

import java.util.Scanner;

public class Program4_2510110122 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter m1: ");
        int m1= input.nextInt();
        System.out.print("Enter m2: ");
        int m2= input.nextInt();
        System.out.print("Enter c1: ");
        int c1= input.nextInt();
        System.out.print("Enter c2: ");
        int c2= input.nextInt();
        if(m1==m2 && c1!=c2) System.out.println("The two lines are parallel");
        else if(m1==m2 && c1==c2) System.out.println("The two lines are coincident lines");
        else System.out.println("the two lines are not parallel since their slopes are not same");
    }
}
