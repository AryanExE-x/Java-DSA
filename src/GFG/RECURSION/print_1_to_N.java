package GFG.RECURSION;

import java.util.Scanner;

public class print_1_to_N {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        print(1,n);
    }
    static void print(int x,int n){
        if(x>n) return;
        if(x==n) {
            System.out.println(x);
            return;
        }
        else System.out.println(x);
        print(x+1,n);
        System.out.println(x);
    }
}
