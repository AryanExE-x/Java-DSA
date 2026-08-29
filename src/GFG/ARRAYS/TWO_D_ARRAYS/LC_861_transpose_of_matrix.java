package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.Scanner;
//Remember this for interviews
//?Square matrix → can transpose in-place using swapping.
//*        n × n → n × n
//?Rectangular matrix → need a new matrix.
// *       rows × cols → cols × rows
public class LC_861_transpose_of_matrix {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){  //!IMPORTANT GALTI-- NOTES MEIN ADD KRNA J<I ONLY--ROUGH WORK
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
            }
        }  //this swapping method is only for square matrix
        print(arr);
    }
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int el : a){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
} //TODO            BETTER APPROACH
class transposeNotSquareMatrix{ //in a new matrix
        public int[][] transpose(int[][] a) {
            int row = a.length;
            int col = a[0].length;
            int[][] b = new int[col][row];
            for(int i = 0; i < b.length; i++) { //b.length=columns
                for(int j = 0; j < b[0].length; j++) { //b[0].length=rows
                    b[i][j] = a[j][i];
                }
            }
            return b;
        }
}
