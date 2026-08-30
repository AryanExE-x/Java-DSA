package GFG.ARRAYS.TWO_D_ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class LC_119_PascalTriangleII {
        public static List<Integer> getRow(int rowIndex) {
            List<List<Integer>> ans = new ArrayList<>();
            for(int i=0;i<=rowIndex;i++){
                ans.add(new ArrayList<>());
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i) ans.get(i).add(1); // arr[i][j]=1;

                        //arr[i][j]=arr[i-1][j]+arr[i-1][j-1]
                    else{
                        int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                        ans.get(i).add(val);
                    }
                }
            }
            return ans.get(rowIndex); //return ith row arraylist element
        }
        public static void main(String[] args){
            List<Integer> result = getRow(4);
            System.out.println(result);


        }
}
