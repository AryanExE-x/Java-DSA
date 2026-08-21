package GFG.CYCLIC_SORT;

public class LC_missing_in_arr268 {

    public static int missing(int[] arr){
        int n=arr.length+1; //1 to n and one number is missing in array.
        int i=0;
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i]==n) i++;  /*agar sahi position pe hoga move i to nex element*/
            else{ /*agar sahi pe nhi hai then swap it with that index*/
                int idx=arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for(i=0;i<arr.length;i++){ /*traverse after swapping and see which element is missing*/
            if(arr[i]!=i+1) return i+1;
        }
        return n;
    }

    public static void swap(int[] arr,int i, int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
