package GFG.STRINGS;

import java.util.Scanner;

public class count_vowels {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "asdbaigsdiujokwpdmnqw";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
