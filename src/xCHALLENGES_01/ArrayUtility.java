package xCHALLENGES_01;
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=input.nextInt();
        int[] arr=new int[size];
        int i=0;
        while(i<size){
            System.out.print("Please enter element no " + (i+1) + " : ");
            arr[i]=input.nextInt();
            i++;
        }
        System.out.println();
        return arr;
    }

    public static void displayArr(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=input.nextInt();
        System.out.print("Enter no of columns: ");
        int columns=input.nextInt();
        int[][] arr=new int[rows][columns];

        int i=0;
        while(i<rows){
            int j=0;
            while(j<columns){
                System.out.print("Please enter element (row): " + (i+1) + " (column): " + (j+1) + "-> ");
                arr[i][j]=input.nextInt();
                j++;
            }

            i++;
        }

        return arr;
    }

    public static void display2DArr(int[][] arr){
        System.out.println("The array is:-\n");
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }



}
