package xUNIT2;
import java.util.Scanner;
 class Recursion {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num=input.nextInt();
         int fact=factorial(num);
         System.out.printf("The factorial for %d is %d\n",num,fact);
         System.out.println("----------");
         printfactorial(num);
     }

     public static int factorial(int num){
         if(num==0 || num==1){
             return 1;
         }

         if(num<0){
             return -1;
         }

         else{
             return num * factorial(num-1);
         }
     }

     public static void printfactorial(int num){

         for(int i=num;i>=2;i--){
             System.out.print(i + " x ");
         }
         System.out.print("1 = " + factorial(num));
     }


}