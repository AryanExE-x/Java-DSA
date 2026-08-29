package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;

public class printColumnWise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,4,1,2}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
