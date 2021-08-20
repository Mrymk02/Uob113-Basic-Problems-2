/*
Question:

Write a program that reads three floating
point numbers N1, N2, and N3 from the user.
It is required to find and print the value
of the following formula:

F = N1 + (N1 × N2) / 4 − N3

 */

import java.util.Scanner;

public class Fformula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float N1, N2, N3;

        System.out.println("Enter three floating point numbers: ");
        N1 = input.nextFloat();
        N2 = input.nextFloat();
        N3 = input.nextFloat();

        float F = N1 + ((N1 * N2) / 4) - N3;
        System.out.println("F = " + F);
    }
}
