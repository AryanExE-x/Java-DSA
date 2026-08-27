package GFG.ARRAYS;

public class LC_segregate_0_and_1 {
    static void segregate(int[] arr){
        int numOfZeros=0;
        int numOfOnes=0;
        for(int el : arr){
            if(el==0) numOfZeros++;
            else numOfOnes++;
        }
/*two pass solution*/
        // Fill the array with 0s first
        int i = 0;   /*initial index at 0 and start filling using while*/
        while (numOfZeros > 0) {
            arr[i] = 0;
            i++;
            numOfZeros--;
        }

        // Fill the remaining positions with 1s
        while (numOfOnes > 0) {
            arr[i] = 1;
            i++;
            numOfOnes--;
        }
    }
    /*two pointer technique */
    static void twopointer(int[] array){
        int n=array.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(array[i]==0) i++;
            else if(array[j]==1) j--;
            else if(array[i]==1 && array[j]==0){
                array[i]=0;
                array[j]=1;
                i++;
                j--;
            }
        }
    }
}
