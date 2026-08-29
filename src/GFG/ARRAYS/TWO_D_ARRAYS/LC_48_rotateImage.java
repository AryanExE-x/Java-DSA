package GFG.ARRAYS.TWO_D_ARRAYS;

public class LC_48_rotateImage { //! rotate by 90 degrees CW
    public static void rotate(int arr[][]){
        //Transpose
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //Reverse each row
        for(int i=0;i<arr.length;i++){
            int startCol=0; int endCol=arr[0].length-1;
            while(startCol<endCol){
                int temp = arr[i][startCol];
                arr[i][startCol]=arr[i][endCol];
                arr[i][endCol]=temp;
                startCol++;
                endCol--;
            }
        }
    }
}
