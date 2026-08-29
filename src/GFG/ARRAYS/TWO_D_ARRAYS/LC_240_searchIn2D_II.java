package GFG.ARRAYS.TWO_D_ARRAYS;

public class LC_240_searchIn2D_II {
    public boolean searchInMatrix(int[][] arr, int target) {
        int m = arr.length; int n = arr[0].length;
        int i =0; int j =n-1;
        while(i<m && j>=0){
            if(arr[i][j]>target) j--; //go left
            else if(arr[i][j]<target) i++; //go down;
            else return true; //found target
        }
        return false; //not found
    }
}
