package GFG.BINARY_SEARCH_01;

public class LC_square_root_binary_searchV2 {
    static int sqroot(int n){
        if(n==0) return 0; // warna error dega loop mein "divide by "0...
        int lo=1; int hi=n;  /*this is not an array its a number so indexing nhi hogi*/
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;  /*since (lo+hi)/2=> (lo+hi+lo-lo)/2-> (2lo+ hi-lo)/2-> lo + (hi-lo)/2  */
            if(mid==n/mid) return mid;  /*since mid*mid==n  -> mid == n/mid  */
            else if(mid>n/mid) hi = mid-1;
            else if(mid<n/mid) lo = mid+1;
        }
        return hi;

    }
}
