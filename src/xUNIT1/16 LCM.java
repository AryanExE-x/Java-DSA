package xUNIT1;
import java.util.Scanner;
class LCM {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number 1:");
        int first = input.nextInt();
        System.out.print("Enter your number 2:");
        int second = input.nextInt();
        int ans=returnLCM(first,second);
        System.out.printf("The LCM of %d and %d is %d",first,second,ans);
    }
    public static int returnLCM(int first,int second){
        /*int max = Math.max(first, second);*/
        int max;
        if(first>second) max=first;
        else max=second;
        while(true){
            if(max%first==0 && max%second==0){
                return max;
            }
            max++;
        }
    }

}
