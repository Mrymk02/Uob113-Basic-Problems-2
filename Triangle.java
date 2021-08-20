/*
Question:

The area of a triangle is computed by taking half
the product of its base and height.

Area = 1/2 × base × height

Write a program that reads the base and height of
a triangle and displays the area.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;

        System.out.println("Enter the base of the triangle: ");
        base = input.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        height = input.nextDouble();

        System.out.println("Area of the triangle = " + 1/2 * base * height);
    }

}
