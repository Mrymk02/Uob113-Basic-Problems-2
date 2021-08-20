/*
Question:

The Perimeter, Surface Area, and Volume of an
in-ground pool are given by the following formulas:

• Perimeter = 2(length + width)
• Volume = length × width × depth
• Surface Area = 2(length + width) × depth + length × width

Using these formulas as a basis, write a JAVA program
that accepts the length, width, and depth measurements
and then calculates the perimeter, volume, and surface
area of the pool.
 */

import java.util.Scanner;

public class PoolMeasure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length, width, and depth of the pool: ");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double depth = input.nextDouble();

        //• Perimeter = 2(length + width)
        //• Volume = length × width × depth
        //• Surface Area = 2(length + width) × depth + length × width

        double Perimeter = 2 * (length + width);
        double Volume = length * width * depth;
        double SurfaceArea = Perimeter * depth + length * width;

        System.out.print("Perimeter = " + Perimeter);
        System.out.print("Volume = " + Volume);
        System.out.print("Surface Area = " + SurfaceArea);
    }
}
