package LAB_ASSIGNMENTS.LabAssignment2;

import java.util.Scanner;

public class Program2_2510110122 {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1=input.nextInt();
        System.out.print("Enter the second number : ");
        int n2=input.nextInt();
        System.out.print("Enter the third number : ");
        int n3=input.nextInt();
        System.out.println("The first, second and third values are respectively: " + n1+ " " + n2 + " " + n3);
//        int max= Math.max(n1,(Math.max(n2,n3)));
        if(n1>n2 && n1>n3)
            System.out.println("The maximum value among the three is: " + n1);
        else if(n2>n3 && n2>n1){
            System.out.println("The maximum value among the three is : " + n2);
        }
        else{
            System.out.println("The maximum value among the three is: " + n3);
        }
//        System.out.println("The maximum value among the three values entered is : " + max);
    }
}
