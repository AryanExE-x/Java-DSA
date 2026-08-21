package GFG.RECURSION;

public class a_raised_to_b {/*linear*/
    public static int power(int a,int b){
        if(b==0) return 1;
        return a*power(a,b-1);
    }
}
