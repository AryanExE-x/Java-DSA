package GFG.SORTING_ALGO;

import java.util.ArrayList;
import java.util.Arrays;
public class LC_common_elements {  /*two arr common el return krna h*/
    public static ArrayList<Integer> commonEl(int[] arr, int[] brr){
            Arrays.sort(arr);  //!mlogm.
            Arrays.sort(brr);  //!nlogn.
            ArrayList<Integer> ans = new ArrayList<>();
            int i=0; int j=0;
            while(i<arr.length && j<brr.length){ /*dono andar hone chahiye.koi ek bhi bhar gya toh break loop*/
                if(arr[i]==brr[j]){
                    ans.add(arr[i]);
                    i++;
                    j++;
                }
                else if(arr[i]<brr[j]) i++;
                else if(arr[i]>brr[j]) j++;
            }  //!while loop mein consider m+n T.C since koi ek toh chota hoga hi assume krlo.
            return ans;

    }

}
