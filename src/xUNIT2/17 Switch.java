package xUNIT2;
import java.util.Scanner;
class Switch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your day in number: ");
    int day = input.nextInt();
    System.out.println();
//    oldSwitch(day);
    newSwitch(day);
  }
  public static void newSwitch(int day){
    /*Enhanced Switch Java 12. Switch expression Java 14 (Switch can return a value)*/
    
    String dayString = switch (day){
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6,7 -> "HOLIDAY";   /*MULTIPLE CASES. NO NEED OF FALL THROUGH*/
      default -> "Invalid Day";
    };
    System.out.println(dayString);
  }

  public static void oldSwitch(int day){
    switch(day){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:  /*FALL THROUGH CASE THIS WILL CONSIDER CASE 7 ONLY*/
      case 7:
        System.out.println("HOLIDAY");
        break;
      default:
        System.out.println("Invalid Day");
        break;
    }
  }

}
