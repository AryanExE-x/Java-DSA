//   and &&    or ||    not !
package xUNIT1;
import java.util.Scanner;
 class Logical {
  public static void main(String[] args){
   Scanner input= new Scanner(System.in);
   System.out.print("Enter your age: ");
   int age=input.nextInt();
   System.out.print("Are you a female (true/false): ");
   boolean isFemale=input.nextBoolean();
   if(age<5){
    System.out.print("You get a discount of 75%!");
   }
   else if(isFemale){  /*Only females*/
    System.out.print("You get a discount of 50%!");
   }
   else if(age>60 && !isFemale){  /*Male Senior Citizen*/  //or isFemale==false
    System.out.print("You get a discount of 40%!");
   }
   else{
    System.out.print("You get no discount!");
   }

  }
}
