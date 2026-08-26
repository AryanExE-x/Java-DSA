package GFG.RECURSION;

public class reverse_of_num {

    public static int reverse(int n,int r){
        if(n==0) return r;
        return reverse(n/10,r*10+(n%10));
    }

    static void main(String[] args) {
        int n = 513313;
//        int r=0;
//        while(n!=0){
//            r*=10;
//            r+=(n%10);
//            n/=10;
//        }
//        System.out.println(r);
        System.out.println(reverse(n,0));
    }
}
