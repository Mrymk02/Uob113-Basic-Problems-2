/*
Question:

Write a program that converts a distance measure
from inches to cents. Note that one inch is equal
to 2.54 centimeters?

ans: multiply the length value (inch) by 2.54
 */

import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length; //declaring variable

        //asking user to input length in inch unit
        System.out.println("Enter the length of a distance (in inches): ");
        length = input.nextDouble(); // reading the length

        //printing the conversion
        System.out.println(length + " inch = " + length * 2.54 + " cm");

    }

}

//another solution:
/*
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        String unit;

        System.out.println("Enter the length of a distance with its unit: ");
        length = input.nextDouble();
        unit = input.next();

        if(unit.equalsIgnoreCase("cm"))
        {
            double cmToInch;
            cmToInch = length / 2.54;
            System.out.println(length + " cm = " + cmToInch + " inch");
        }
        else if (unit.equalsIgnoreCase("inch"))
        {
            double inchToCm;
            inchToCm = length * 2.54;
            System.out.println(length + " inch = " + inchToCm + " cm");
        }
         */
