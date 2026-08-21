package xCHALLENGES_01;
import java.util.Scanner;
class LoopPatternsSTAR {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=input.nextInt();
        printRightHalfPyramid(num);
        System.out.println();
        printReverseRightHalfPyramid(num);
        System.out.println();
        printLeftHalfPyramid(num);

    }

    public static void printLeftHalfPyramid(int maxRows){
        int i=maxRows;
        while(i>0){

            /*this loop prints spaces*/
            int k=0;
            while(k<i-1){
                System.out.print("  ");
                k++;
            }

            /*this loop prints stars*/
            int j=0;
            while(j<=(maxRows-i)){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void printReverseRightHalfPyramid(int maxRows){
        int i=maxRows;
        while(i > 0){
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void printRightHalfPyramid(int maxRows){
        int i = 0;
        while(i < maxRows){
            System.out.print("*");
            int j=0;
            while(j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();  //for skipping a line. same as \n
            i++;
        }

    }

}
