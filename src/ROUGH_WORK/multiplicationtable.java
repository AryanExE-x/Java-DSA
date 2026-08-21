package ROUGH_WORK;
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to evaluate its table: ");
        int num=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.printf("%d x %d = %d",num,i,(num*i));
            System.out.println();
            i++;
        }

    }


}

