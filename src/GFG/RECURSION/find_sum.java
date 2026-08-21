package GFG.RECURSION;

public class find_sum {
    public static int findSum(int num){
        if(num==1) return 1;
        return num+findSum(num-1);
    }
}
