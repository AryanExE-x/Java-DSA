package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class matrixSnakePattern {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
