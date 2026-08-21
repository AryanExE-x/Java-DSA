package xUNIT2;
import java.util.Scanner;
class Break {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        for (int i=0;i<100;i++){
            if(i==5){
                continue;
            }
            if(i==10){
                break;
            }

        System.out.print(i + " ");
    }
 }
}
