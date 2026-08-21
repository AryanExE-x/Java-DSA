package GFG.BINARY_SEARCH_01;

public class LC_maxcount_pos_neg {  /*max count of pos and neg integers in a sorted arr--> binary search*/
    static int posInt(int[] arr){
        int n=arr.length;
        int lo=0; int hi=n-1;
        while(lo<=hi){
            int mid= lo + (hi-lo)/2;
            if(arr[mid]>0) hi=mid-1;  /*for pos find first positive element*/
            else lo=mid+1;
        }
        return n-lo;
    }

    static int negInt(int[] arr){
        int n=arr.length;
        int lo=0; int hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=0) hi=mid-1; /*for neg find first-non negative element*/
            else lo=mid+1;
        }
        return lo;
    }
}
