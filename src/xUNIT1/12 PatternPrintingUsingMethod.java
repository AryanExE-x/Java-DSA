package xUNIT1;
import java.util.Scanner;
 class PatternPrintingUsingMethod {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter number of rows: ");
   int num=input.nextInt();
   printFirstPattern(num);  /*Same as function calling*/
  }

  public static void printFirstPattern(int num){  /*Same as function declaration*/
   int rows=0;
   while(rows<num){
    System.out.print("*");
    int i=0;
    while(i<rows){
     System.out.print(" *");
     i++;
    }
    System.out.println();
    rows++;
   }


  }

}
