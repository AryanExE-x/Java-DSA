package GFG.RECURSION;

import java.util.Scanner;

import static java.lang.System.in;

public class print_1toN_Nto1 {
    static        int n=5;
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print(1);
    }
    static void print(int n){
        if(n==n){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        print(n+1);
        System.out.print(n + " ");
    }
}
