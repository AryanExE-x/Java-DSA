package GFG.LOOPS;
import java.util.Scanner;
public class print_all_factors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = input.nextInt();
        System.out.print("The factors are : ");
        boolean found=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i + " ");
                found=true;
            }
        }
        if(!found){
            System.out.println("No factors");
        }
    }
}
