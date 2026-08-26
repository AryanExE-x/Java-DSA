package GFG.SORTING_ALGO;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = nums[i];             // swap
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
        return nums[k - 1];
    }
}
public class LC_215_kth_LargestElementInARR { //*USING SELECTION SORT
        public int findKthLargest(int[] nums,int k) {
            int n = nums.length;
            for (int i = 0; i < k; i++) {
                int max = Integer.MIN_VALUE;
                int maxIdx=-1;
                for(int j=i;j<n;j++){
                    if(nums[j]>max){
                        max=nums[j];
                        maxIdx=j;
                    }
                }
                int temp=nums[i];
                nums[i]=nums[maxIdx];
                nums[maxIdx]=temp;
            }
            return nums[k-1];
        }
}
