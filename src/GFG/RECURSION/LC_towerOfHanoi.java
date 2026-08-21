package GFG.RECURSION;

public class LC_towerOfHanoi {
    public static void main(String[] args){
        hanoiPattern(3,'A','B','C');
    }
    public static void hanoiPattern(int n,char source,char helper,char destination){
        if (n == 0) return;
        /*moving n-1 disks from A to B via C*/
        hanoiPattern(n-1,source,destination,helper);
        /*moving the largest disk from A to C*/
        System.out.println(source + " -> " + destination);
        /*moving n-1 disks now from B to C via A*/
        hanoiPattern(n-1,helper,source,destination);
    }
}
