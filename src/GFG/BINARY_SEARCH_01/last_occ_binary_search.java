package GFG.BINARY_SEARCH_01;

public class last_occ_binary_search {

    public static int lastOc(int[] arr, int target) {

        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int index = -1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (arr[mid] < target) {
                lo = mid + 1;
            }
            else if (arr[mid] > target) {
                hi = mid - 1;
            }
            else {
                index = mid;
                lo = mid + 1;   /* Search on the right*/
            }
        }

        return index;
    }
}