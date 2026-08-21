package GFG.RECURSION;

import java.util.Scanner;

public class n_to_1 {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        print(n);

    }
    static void print(int n){
        if(n==0) return;
        print(n-1);      /*recursive call lagega for 1 to n*/
        System.out.println(n + " ");
//        print(n-1);       /*recursive call lagega for n to 1*/
    }
}
