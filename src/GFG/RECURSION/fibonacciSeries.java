package GFG.RECURSION;

public class fibonacciSeries { /*O(2^n)*/
    public static int fibo(int n){
        if(n==0 || n==1) return n;//0 1 1 2 3 5 8 13 21 34.first two will always be 0 and 1..0 for 0 1 for 1
        return fibo(n-1)+fibo(n-2);
    }

}
