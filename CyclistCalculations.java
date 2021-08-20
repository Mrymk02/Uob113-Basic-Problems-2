/*
Question:

Write a Java program that will perform some
calculations regarding a cyclist coasting on
a road. The program will ask the user to enter
the cyclist’s initial speed Vinitial, the
duration (in minutes), and the final speed Vfinal.
The program will then calculate the rate of
acceleration using the formula:

acceleration = (Vfinal − Vinitial) ÷ duration

Next, calculate how long it will take for the
cyclist to stop (given the initial speed and
the calculated acceleration.) The necessary
formula is:

time = Vinitial ÷ acceleration

Display the acceleration and time on screen
formatted to the below samples.

Sample Input/Output
Enter initial speed, final speed and duration
18.0 36.0 4.0
Acceleration = 4.5
4.0 minutes to stop
 */

import java.util.Scanner;

public class CyclistCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Vintial;
        double Vfinal;
        double duration;

        System.out.println("Enter initial speed, final speed and duration: ");
        Vintial = input.nextDouble();
        Vfinal = input.nextDouble();
        duration = input.nextDouble();

        double Acc = (Vfinal - Vintial) / duration;
        System.out.println("Acceleration = " + Acc);

        System.out.println(Vintial / Acc + " minutes to stop");
    }
}
