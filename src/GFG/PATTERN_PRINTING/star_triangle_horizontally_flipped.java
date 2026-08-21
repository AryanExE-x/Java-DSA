package GFG.PATTERN_PRINTING;
import java.util.Scanner;
public class star_triangle_horizontally_flipped {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){         /*always prefer this one */
                System.out.print("* ");
            }
//            for(int j=n;j>=i;j--){         not a standard pattern. troubles in case of numbers n alphabets
//                System.out.print("* ");
//            }
            System.out.println();
        }
    }
}
