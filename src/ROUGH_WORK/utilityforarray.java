package ROUGH_WORK;
import java.util.Scanner;
public class utilityforarray {
    public static int[] inputArr(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of the array: " );
        int size=input.nextInt();
        int[] arr = new int[size];
        int index=0;
        while(index<size){
            System.out.printf("Enter element number %d positioned at index %d->",index+1,index);
            arr[index]=input.nextInt();
            index++;
        }
        System.out.println();
        return arr;
    }

    public static void showArr(int[] arr){
        int i=0;
        int size=arr.length;
        while(i<size){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2dArr(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=input.nextInt();
        System.out.print("Enter no of columns: ");
        int columns=input.nextInt();
        int[][] twoDarr= new int[rows][columns];
        int i=0;
        while(i<rows){
            int j=0;
            while(j<columns){
                System.out.printf("Enter the number of %d row and %d column -> ",i+1,j+1);
                twoDarr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return twoDarr;
    }

    public static void show2dArr(int[][] arr){
        int i = 0;
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
