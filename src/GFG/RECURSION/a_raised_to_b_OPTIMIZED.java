package GFG.RECURSION;

public class a_raised_to_b_OPTIMIZED { /*logarithmic*/
    public static int powerLog(int a,int b){
        if(b==0) return 1 ;
        int call=powerLog(a,b/2);
        if(b%2==0) return call*call; //for even.
        else return a*call*call; //for odd.
    }
}
