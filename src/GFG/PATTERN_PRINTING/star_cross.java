package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class star_cross {
    static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num=input.nextInt();
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(i==j || j==num-i+1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}
