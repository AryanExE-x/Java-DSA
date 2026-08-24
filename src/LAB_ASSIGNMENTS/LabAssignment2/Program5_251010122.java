package LAB_ASSIGNMENTS.LabAssignment2;

import java.util.Scanner;

//class Student{
//    int roll;
//    int marks1;
//    int marks2;
//    int marks3;
//    int marks4;
//    int marks5;
//
//    double average(int marks1,int marks2,int marks3,int marks4, int marks5){
//
//    }
//}
public class Program5_251010122 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter roll number of Student 1: ");
        int roll1=input.nextInt();
        System.out.println("Enter marks out of 100 for all the five subjects at once: ");
        int marks11=input.nextInt();
        int marks12=input.nextInt();
        int marks13=input.nextInt();
        int marks14=input.nextInt();
        int marks15=input.nextInt();
        double avg1=(double)(marks11+marks12+marks13+marks14+marks15)/5;
        System.out.print("Enter roll number of Student 2: ");
        int roll2=input.nextInt();
        System.out.println("Enter marks out of 100 for all the five subjects at once: ");
        int marks21=input.nextInt();
        int marks22=input.nextInt();
        int marks23=input.nextInt();
        int marks24=input.nextInt();
        int marks25=input.nextInt();
        double avg2=(double)(marks21+marks22+marks23+marks24+marks25)/5;
        System.out.print("Enter roll number of Student 3: ");
        int roll3=input.nextInt();
        System.out.println("Enter marks out of 100 for all the five subjects at once: ");
        int marks31=input.nextInt();
        int marks32=input.nextInt();
        int marks33=input.nextInt();
        int marks34=input.nextInt();
        int marks35=input.nextInt();
        double avg3=(double)(marks31+marks32+marks33+marks34+marks35)/5;
        System.out.print("Enter roll number of Student 4: ");
        int roll4=input.nextInt();
        System.out.println("Enter marks out of 100 for all the five subjects at once: ");
        int marks41=input.nextInt();
        int marks42=input.nextInt();
        int marks43=input.nextInt();
        int marks44=input.nextInt();
        int marks45=input.nextInt();
        double avg4=(double)(marks41+marks42+marks43+marks44+marks45)/5;
        System.out.print("Enter roll number of Student 5: ");
        int roll5=input.nextInt();
        System.out.println("Enter marks out of 100 for all the five subjects at once: ");
        int marks51=input.nextInt();
        int marks52=input.nextInt();
        int marks53=input.nextInt();
        int marks54=input.nextInt();
        int marks55=input.nextInt();
        double avg5=(double)(marks51+marks52+marks53+marks54+marks55)/5;
        System.out.printf("Roll: %s  Marks: %s %s %s %s %s  Average: %.2f\n",roll1,marks11,marks12,marks13,marks14,marks15,avg1);
        System.out.printf("Roll: %s  Marks: %s %s %s %s %s  Average: %.2f\n",roll2,marks21,marks22,marks23,marks24,marks25,avg2);
        System.out.printf("Roll: %s  Marks: %s %s %s %s %s  Average: %.2f\n",roll3,marks31,marks32,marks33,marks34,marks35,avg3);
        System.out.printf("Roll: %s  Marks: %s %s %s %s %s  Average: %.2f\n",roll4,marks41,marks42,marks43,marks44,marks45,avg4);
        System.out.printf("Roll: %s  Marks: %s %s %s %s %s  Average: %.2f\n",roll5,marks51,marks52,marks53,marks54,marks55,avg5);
    }
}
