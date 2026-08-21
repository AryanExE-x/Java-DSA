package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class alphabet_square_case_4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==0){
                    System.out.print((char)(j+64) + " ");
                }
                else{
                    System.out.print((char)(j+96) + " ");
                }
            }
            System.out.println();
        }
    }
}
