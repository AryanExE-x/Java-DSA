package GFG.OOPS;

import java.util.Scanner;

public class stringBuilderInput {
    static void main() {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(input.nextLine());
        System.out.println(sb);
    }
}
