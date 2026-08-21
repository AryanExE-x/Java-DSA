//NESTING OF LOOPS- GREATEST OF ALL
package xCHALLENGES_01;
import java.util.Scanner;
public class NestingOfLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=input.nextInt();
        System.out.print("Enter Second number: ");
        int b=input.nextInt();
        System.out.print("Enter third number: ");
        int c=input.nextInt();

        /*  if(a>b && a>c){
            System.out.println("A is the greatest");
        }
        else if(b>a && b>c){
            System.out.println("B is the greatest");
        }
        else System.out.println("C is the greatest");
        }
        */

        if(a>b){
            if(a>c){   //a>b and a>c
                System.out.println("A is the greatest");
            }
            else {      //a>b and c>a
                System.out.println("C is the greatest");
            }
        }
        else{           //b>a
            if(b>c){   //b>a and b>c
                System.out.println("B is the greatest");
            }
            else{       //b>c and c>b
                System.out.println("C is the greatest");
            }
        }
    }
    }