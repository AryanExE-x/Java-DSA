package GFG.LOOPS;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println((i+1) + "\n"+ (n-i));
        }
    }
}
