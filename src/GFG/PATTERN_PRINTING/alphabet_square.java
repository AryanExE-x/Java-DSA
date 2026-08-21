package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class alphabet_square {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

    }
}
