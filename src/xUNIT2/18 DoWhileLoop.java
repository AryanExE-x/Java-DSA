/*Executes block first, then checks condition
* Guaranteed to run at least one iteration
* Unlike while, first iteration is unconditional
* Dont forget to update condition to avoid infinite loops*/

package xUNIT2;
import java.util.Scanner;
class DoWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter your age: ");
//        int age=input.nextInt();
//        while(age<0 || age>100){
//            System.out.print("Enter your age: ");
//            age=input.nextInt();
//        }
//        System.out.println("Your age is: " + age);

         /*sabse pehle user se input le hi lo..ab ye loop chalaate raho baar baar jab tak
         * condition true hai..that is jab tak faulty age input hori hai tab tak*/
        int age;
        do {
            System.out.print("Enter your age: ");
            age=input.nextInt();
        } while (age<0 || age>100);
        System.out.println("Your age is : " + age);

    }

 }
