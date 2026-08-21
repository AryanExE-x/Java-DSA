package xCHALLENGES_01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MonthOfYearUsingSwitch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of the month: ");
        int monthNumber = input.nextInt();
        String monthName=getMonthName(monthNumber);
        System.out.println("Your month name is: " + monthName);
        System.out.println("--------------------------------");

        System.out.print("Enter a month name to know its number: ");
        String month=input.next();

        getMonthNumber(month);
    }

    public static String getMonthName(int month){
        String monthName = switch(month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        };
        return monthName;
    }

    public static void getMonthNumber(String monthName){
        int monthNum=switch(monthName){
            case "January" -> 1;
            case "February" -> 2;
            case "March" -> 3;
            case "April" -> 4;
            case "May" -> 5;
            case "June" -> 6;
            case "July" -> 7;
            case "August" -> 8;
            case "September" -> 9;
            case "October" -> 10;
            case "November" -> 11;
            case "December" -> 12;
            default -> -1;
        };
        System.out.printf("%s is (%d)th Month",monthName,monthNum);
    }

}
