package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class alphabet_square_2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print((char)(i+'a'-1) + " ");       //i+96 bhi kr skte h
            }
            System.out.println();
        }
    }
}
