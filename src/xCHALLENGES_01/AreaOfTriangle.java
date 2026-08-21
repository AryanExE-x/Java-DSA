package xCHALLENGES_01;

import java.util.Scanner;

public class AreaOfTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base length of triangle: ");
        double b= input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double h= input.nextDouble();
        double area= 0.5 * b * h;

        /*double area = 0.5f * b * h; //double area = ((double) 1 / 2) * b * h; */

        System.out.println("The area of the triangle is: " + area);


    }
}
