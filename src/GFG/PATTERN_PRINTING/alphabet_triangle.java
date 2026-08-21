package GFG.PATTERN_PRINTING;
import java.util.Scanner;

public class alphabet_triangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64) + " ");      /*modify with i and j for diff results*/
            }
            System.out.println();
        }
    }
}
