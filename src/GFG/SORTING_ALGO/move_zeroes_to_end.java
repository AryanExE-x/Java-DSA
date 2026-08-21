package GFG.SORTING_ALGO;

public class move_zeroes_to_end {
    public static void moveZeroes(int[] arr){
        int n=arr.length;
        for(int passes=0;passes<n-1;passes++){
            for(int i=0;i<n-1-passes;i++){
                if(arr[i]==0){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}
