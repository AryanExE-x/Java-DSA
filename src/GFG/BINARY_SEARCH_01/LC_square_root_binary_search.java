package GFG.BINARY_SEARCH_01;

public class LC_square_root_binary_search {/*1 se leke n is a sorted search space-> binary search lagao*/
    static int sqroot(int n){
        long lo=1; long hi=n;  /*long because of TLE error in case of very large number*/
        while(lo<=hi){
            long mid=(lo+hi)/2;
            if(mid*mid==n) return (int)mid;
            else if(mid*mid>n) hi = mid-1;
            else if(mid*mid<n) lo = mid+1;
        }
        return (int)hi;

    }
}
