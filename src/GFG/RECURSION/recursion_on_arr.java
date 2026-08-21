package GFG.RECURSION;

public class recursion_on_arr {
    public static void recPrint(int[] arr, int idx){
        int n=arr.length; /*last element ke baad end!!*/
        if(idx==n) return; /*in void return-> khatam */
        System.out.print(arr[idx] + " ");
        recPrint(arr,idx+1);
    }

    public static void recPrintREVERSE(int[] arr, int idx){
        if(idx<0) return; /*in void return-> khatam */
        recPrintREVERSE(arr,idx-1); //reverse matlab reverse recursive calls
        System.out.print(arr[idx] + " "); //?change the order to print and see reverse magic
    }

    public static boolean exists(int[] arr,int target,int idx){
        if(arr[idx]==arr.length) return false; //base case...
        if(arr[idx]==target) return true;
        return exists(arr,target,idx+1);
    }

    public static void main(String[] args){
        int[] arr = {2,43,234,62323,436,123,23};
        int x=arr.length;
        recPrint(arr,0);
        System.out.println("\n");
        recPrintREVERSE(arr,x-1);
    }
}
