package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class alphabet_triangle_horizontally_flipped {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print((char)(i+64) + " ");  /*swap i and j // 64 and 96*/
            }
            System.out.println();
        }
    }
}
