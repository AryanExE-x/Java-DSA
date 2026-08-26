package GFG.RECURSION;

public class LC_recursion_binary_search {

    public static int helper(int[] arr,int target,int lo,int hi){
        if(lo>hi) return -1; //basecase...
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==target) return mid;  //basecase 2
        else if(arr[mid]>target) return helper(arr,target,lo,mid-1); //search in left part from mid
        else return helper(arr,target,mid+1,hi); //search in right part from mid
    }

    public static int search(int[] arr,int target){
        int n= arr.length;
        return helper(arr,target,0,n-1);
    }
}
