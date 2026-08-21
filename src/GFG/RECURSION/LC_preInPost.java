package GFG.RECURSION;

public class LC_preInPost {
    static void main(String[] args) {
        pip(1);
        System.out.println();
        pip(2);
        System.out.println();
        pip(3);
    }
    static void pip(int n){
        if(n==0) return;
        System.out.print(n + " "); //pre.
        pip(n-1);
        System.out.print(n + " "); //in.
        pip(n-1);
        System.out.print(n + " "); //post.
    }
}
