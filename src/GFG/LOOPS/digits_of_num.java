package GFG.LOOPS;
import java.util.Scanner;
public class digits_of_num {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num=input.nextInt();
        int count=0;


//        while(num!=0){
//            num=num/10;
//            count++;
//        }

        for(;num!=0;num/=10){
            count++;
        }

        System.out.println("number of digits: " + count);
    }
}
