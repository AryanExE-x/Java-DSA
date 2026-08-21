package GFG.RECURSION;

public class climbing_nth_staircase {/*max 2 jumps*/
    public static int stairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return stairs(n-1)+stairs(n-2);  /*TLE Error O(2^n)*/ //abhi ke liye maan lo recursion mein
    }
}
