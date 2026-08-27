package GFG.ARRAYS;

public class LC_rotate_array {
    public static void rotate(int[] arr, int d){  //d is no of elements rotated at the end of arr.
        int n= arr.length;
        d = d % n;    //for cases where d>n toh remainder hi ayega rotate karne pe bhi
        reverse(arr,d,n-1);
        reverse(arr,0,d-1); //first split then reverse
        reverse(arr,0,n-1);  //poore ka reverse
    }

    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
