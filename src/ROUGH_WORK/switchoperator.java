package ROUGH_WORK;
import java.util.Scanner;
public class switchoperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day number : ");
        int day = input.nextInt();
//        newSWITCH(day);
        olddSWITCH(day);
    }
    public static void newSWITCH(int num){
        String output=switch (num){
            case 1 -> "Mon";
            case 2 -> "Tue";
            default -> "Invalid";
        };
        System.out.println(output);
    }


    public static void olddSWITCH(int num){
            switch (num) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("TUe");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
    }
}
