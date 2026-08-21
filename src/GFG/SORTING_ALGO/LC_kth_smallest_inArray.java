package GFG.SORTING_ALGO;

import xCHALLENGES_01.ArrayUtility;

public class LC_kth_smallest_inArray {
    static int smallestKthElement(int[] arr,int k) {  /*using the algo of selection sort*/
        int n = arr.length;
//TIME COMPLEXITY= O(n*k)...
        for (int i = 0; i < k; i++) {  /*upto kth pass hi chahiye to get kth smallest el*/

            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr[k - 1];
    }
}
