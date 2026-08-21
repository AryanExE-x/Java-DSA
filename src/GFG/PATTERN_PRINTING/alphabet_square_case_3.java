package GFG.PATTERN_PRINTING;

import java.util.Scanner;

public class alphabet_square_case_3 {
    static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            char ch;
            if(i%2==0){
                ch=(char)(i+96);
            }
            else{
                ch=(char)(i+64);
            }
            for(int j=1;j<=n;j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
