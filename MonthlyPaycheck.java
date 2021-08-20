/*
Question:

Write a program that calculates and prints the
monthly paycheck for an employee. The net pay
is calculated after the following deductions:

• Medicare/Medicaid Tax: 2.75%
• Pension Plan: 6%
• Health Insurance: BD. 75

Your program should prompt the user to enter
the gross amount and print the net pay. A sample
Input/Output is shown below:

Enter gross amount (BD): 650
---------- Paycheck -----------
Gross amount: 650.000
Medicare/Medicaid Tax: 17.875
Pension Plan: 39.000
Health Insurance: 75.000
-------------------------------
Net Pay: 518.125
 */

import java.util.Scanner;

public class MonthlyPaycheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double GrossAmount;

        System.out.print("Enter gross amount (BD): ");
        GrossAmount = input.nextDouble();

        System.out.println("---------- Paycheck -----------");

        //• Medicare/Medicaid Tax: 2.75%
        //• Pension Plan: 6%
        //• Health Insurance: BD. 75

        double Tax = GrossAmount * 2.75 / 100;
        double Plan = GrossAmount * 6 / 100;
        double Health = 75;
        System.out.printf("Gross amount: %.3f%n" , GrossAmount);
        System.out.printf("Medicare/Medicaid Tax: %.3f%n" , Tax);
        System.out.printf("Pension Plan: %.3f%n" , Plan);
        System.out.printf("Health Insurance: %.3f%n" , Health);

        //no formatting
        /*
        System.out.println("Gross amount: " + GrossAmount);
        System.out.println("Medicare/Medicaid Tax: " + Tax);
        System.out.println("Pension Plan: " + Plan);
        System.out.println("Health Insurance: " + Health);
         */

        System.out.println("-------------------------------");

        //The net pay is calculated after the deduction of:
        //• Medicare/Medicaid Tax
        //• Pension Plan
        //• Health Insurance

        double NetPay = GrossAmount - (Tax + Plan + Health);
        System.out.printf("Net Pay: %.3f%n" , NetPay);


    }
}