package GFG.ARRAYS;
//you are given an array arr[] of size n-1 that contains integers from range 1 to n. find missing int.

public class LC_missing_in_array {
    public static int missingNum(int[] arr){
        int size= arr.length;   //which is n-1;
        int n=size+1; //1 to n tak numbers honge arr mein kyuki ek missing element hai which is not in arr.
        int sum= n*(n+1)/2;
        int arrSum=0;
        for(int ele : arr){
            arrSum+=ele;
        }
        return sum - arrSum;
    }
}
