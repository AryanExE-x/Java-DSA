package GFG.LOOPS;
import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* last term = first term x (common ratio)^(n-1) */
        System.out.print("Enter first term (a): ");
        int a = input.nextInt();
        System.out.print("Enter common ratio (r): ");
        int r = input.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = input.nextInt();

        int term = a;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term * r;
        }

    }
}
