package GFG.LOOPS;
import java.util.Scanner;
public class print_all_factors_using_sqrt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = input.nextInt();
        System.out.print("The factors are : ");
        boolean found=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i + " ");
                if(i!=(n/i)){
                    System.out.print(n/i + " ");
                }
                found=true;
            }
        }
        if(!found){
            System.out.println("No factors");
        }
    }
}
