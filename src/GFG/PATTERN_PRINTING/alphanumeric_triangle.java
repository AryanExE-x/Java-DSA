package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class alphanumeric_triangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print((char)(j+64) + " ");
                }
            }
            System.out.println();
        }
    }
}
