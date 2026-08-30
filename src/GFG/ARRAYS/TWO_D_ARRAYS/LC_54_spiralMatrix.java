package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.ArrayList;

public class LC_54_spiralMatrix {
    public ArrayList<Integer> spirallyTraversing(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int m =arr.length; int n =arr[0].length;
        int firstRow=0; int lastRow=m-1; int firstCol=0; int lastCol=n-1;
        while(firstRow<=lastRow && firstCol<=lastCol){
            for(int j=firstCol;j<=lastCol;j++){ //right
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
//          After each boundary shrink, check whether the boundaries crossed.
//            *This is especially important for:
//            *single row
//            *single column
//            *odd-sized matrices
//            *rectangular matrices.
//TODO      while(firstRow <= lastRow && firstCol <= lastCol)
//TODO      only gets checked when you return to the top of the while loop.
//TODO      It does NOT get checked after every boundary change
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int i=firstRow;i<=lastRow;i++){ //down
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int j=lastCol;j>=firstCol;j--){ //left
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(firstRow>lastRow || firstCol>lastCol) break;
            for(int i=lastRow;i>=firstRow;i--){ //up
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }
        return ans;
    }

     ArrayList<Integer> spirallyTraversingMethod2(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int m =arr.length; int n =arr[0].length;
        int firstRow=0; int lastRow=m-1; int firstCol=0; int lastCol=n-1;
        int totalNumberOfElements=m*n;
        while(ans.size()<totalNumberOfElements){
            for(int j=firstCol;j<=lastCol;j++){ //right
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if(ans.size()==totalNumberOfElements) break;
            for(int i=firstRow;i<=lastRow;i++){ //down
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if(ans.size()==totalNumberOfElements) break;
            for(int j=lastCol;j<=firstCol;j++){ //left
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(ans.size()==totalNumberOfElements) break;
            for(int i=lastRow;i<=firstRow;i++){
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }
        return ans;
    }

}

