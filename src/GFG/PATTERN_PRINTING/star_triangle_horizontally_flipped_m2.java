package GFG.PATTERN_PRINTING;
import java.util.Scanner;

public class star_triangle_horizontally_flipped_m2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int a=n;  /* no of stars to be printed in each line */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){         /*always prefer this one */
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
    }
}
