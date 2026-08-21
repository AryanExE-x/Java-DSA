package GFG.RECURSION;

public class factorial {
    public static int factorial(int num){
        if(num==0||num==1) return 1;
        else{
            int ans=num*factorial(num-1);
            return ans;
        }
    }
}
