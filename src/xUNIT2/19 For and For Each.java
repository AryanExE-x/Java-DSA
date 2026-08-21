//*
//!
//?
package xUNIT2;
import java.util.Scanner;
class ForLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int j =1;
        while(j <=100){
            System.out.print(j + " ");
            j++;
        }   

        System.out.println();

        int k=1;
        do {
            System.out.print(k + " ");
            k++;
        } while(k<=100);

        System.out.println();

        for(int i=1;i<=100;i++){
            System.out.print(i + " ");
        }

        System.out.println("\n");

        String[] arr= {"Ram","Shyam","Mohan","Sohan"};
        printArrFOREACH(arr);
    }
    /*String Traversal*/
    public static void printArrFOREACH(String[] arr){
        for(String name : arr){
            System.out.print(name + " ");
        }
    }
    public static void printArr(String[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }


}


