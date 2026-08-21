//DEGREES CONVERSION

package xCHALLENGES_01;

import java.util.Scanner;

public class DegreesConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter degrees in Celsius: ");
        float degC= input.nextFloat();
        float degF= ((float) 9/5) * degC+ 32.0f;
        float degK= degC + 273;
        System.out.println("Degrees in Fahrenheit is: " + degF);
        System.out.println("Degrees in Kelvin is: " + degK);

    }
}
