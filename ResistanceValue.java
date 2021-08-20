/*
Question:

Write a program to read three resistance
values R1, R2, and R3 in Ohms and compute
their combined resistance Rc when they are
arranged in parallel. The value of Rc is
computed using the following formula.

Rc = 1 ÷ (1 ÷ R1 + 1 ÷ R2 + 1 ÷ R3)

Your program should print the values of
R1, R2, R3 and Rc.

For example, if
R1 = 2.3 Ohms,
R2 = 6.21 Ohms,
R3 = 4.58 Ohms,
then Rc = 1.228269131 Ohms.
 */

import java.util.Scanner;

public class ResistanceValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("R1 = ");
        double R1 = input.nextDouble();

        System.out.print("R2 = ");
        double R2 = input.nextDouble();

        System.out.print("R3 = ");
        double R3 = input.nextDouble();

        double Rc = 1 / ((1 / R1) + (1 / R2) + (1 / R3));
        System.out.printf("Rc = %.9f" , Rc );
        System.out.print(" Ohms");

    }
}
