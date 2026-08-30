package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.*;

public class GFG_multiplyMatrices {
    public static List<List<Integer>> multiply(int[][] a, int[][] b){
            int n = a.length;
            int[][] c= new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            List<List<Integer>> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                ans.add(new ArrayList<>());  //add new empty array list for each row
                for(int j=0;j<n;j++){
                    ans.get(i).add(c[i][j]); //fill each row arraylist with another arraylist
                }
            }
            return ans; //return type is arraylist of arraylists
    }
}
