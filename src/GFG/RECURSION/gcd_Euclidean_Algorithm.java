package GFG.RECURSION;

public class gcd_Euclidean_Algorithm {
    static int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }

    static void main(String[] args) {
        int a=24, b=12;
        int hcf=1;
        for(int i=2;i<=Math.min(a,b);i++){ /*TLE ajayega. more time O(min.(a,b))*/
            if(a%i==0 || b%i==0){
                hcf=i;
            }
        }
        int ans=hcf;
    }
}
