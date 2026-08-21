package GFG.BINARY_SEARCH_01;


public class square_root { /*pos integer n-> square root find. if not a perfect square return floor value*/
    public static int square_root(int n){

        //brute force approach.

        int root=0;
        for(int i=1;i<=n;i++){
            if(i*i>n) break;
            root=i;
        }
        return root;
    }

}
