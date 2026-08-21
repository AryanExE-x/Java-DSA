package xUNIT1;

import java.util.Scanner;

class OddEvenBITWISE {
  static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("Enter the number: ");
   int num= input.nextInt();

   if((num & 1) == 1) System.out.println("The number is odd");
   else System.out.println("The number is even");

  }

 }
