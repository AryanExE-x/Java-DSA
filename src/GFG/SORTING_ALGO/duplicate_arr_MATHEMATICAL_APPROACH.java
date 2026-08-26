package GFG.SORTING_ALGO;

public class duplicate_arr_MATHEMATICAL_APPROACH {
    public static void sortOpt(int[] arr){
        int sumArr=0;
        int sumNum=0;
        int size=arr.length;
        int n=size-1;
        for(int i=0;i<size;i++){
            sumArr+=arr[i];
        }
        for(int j=1;j<=n;j++){
            sumNum+=j;
        }
        int duplicate = sumArr-sumNum;
        duplicate = Math.abs(duplicate);
        System.out.print("The duplicate number in the array is:  " + duplicate);
    }
}
