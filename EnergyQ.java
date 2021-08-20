/*
Question:

Write a program that calculates the
energy needed to heat water from an
initial temperature to a final temperature.

Your program should prompt the user
to enter the amount of water in kilograms
and the initial and final temperature
of the water. The formula to compute
the energy is:

Q = M × (final temperature − initial temperature) × 4184

Where M is the weight of water in kilograms,
temperatures are in degrees Celsius, and energy
Q is measured in joules. Format your output to
three decimal places.

Sample Input/Output:

Enter water amount: 55.5
Enter initial temperature: 3.5
Enter final temperature: 10.8
The energy needed is 1695147.600
 */

import java.util.Scanner;

public class EnergyQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double M;
        double IT;
        double FT;

        System.out.print("Enter water amount: ");
        M = input.nextDouble();

        System.out.print("Enter initial temperature: ");
        IT = input.nextDouble();

        System.out.print("Enter final temperature: ");
        FT = input.nextDouble();

        //Q = M × (final temperature − initial temperature) × 4184
        double Q = M * (FT - IT) * 4184;
        System.out.printf("The energy needed is %.3f" , Q);
    }
}
