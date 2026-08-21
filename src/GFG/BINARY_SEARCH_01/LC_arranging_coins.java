package GFG.BINARY_SEARCH_01;

public class LC_arranging_coins {
    static int sqrt(long n){
        if(n==0) return 0;
        long lo=1; long hi=n;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if(mid==n/mid) return (int)mid;
            else if(mid>n/mid) hi=mid-1;
            else if(mid<n/mid) lo=mid+1;
        }
        return (int)hi;
    }
    public int arrangeCoins(int n){
        long m = (long)n;
        return(sqrt(8*m+1)-1)/2;
    }
}
