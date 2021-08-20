/*
Question:

Two employees in a company are up or special pay
increase. Write a program that reads the last name,
first name, current salary and percent pay increase
for both employees. Your program should display their
salaries after the increase.
 */

import java.util.Scanner;

public class PayIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------- Employee 1 -----------");

        System.out.print("Enter First name: ");
        String empOne_FirstName = input.next();

        System.out.print("Enter Last name: ");
        String empOne_LastName = input.next();

        System.out.print("Enter current salary: ");
        double empOne_Salary = input.nextDouble();

        System.out.print("Enter percent pay increase: ");
        double empOne_PercentPay = input.nextDouble();

        System.out.println("---------- Employee 2 -----------");

        System.out.print("Enter First name: ");
        String empTwo_FirstName = input.next();

        System.out.print("Enter Last name: ");
        String empTwo_LastName = input.next();

        System.out.print("Enter current salary: ");
        double empTwo_Salary = input.nextDouble();

        System.out.print("Enter percent pay increase: ");
        double empTwo_PercentPay = input.nextDouble();

        double empOne_PayIncrease = empOne_Salary * (1 + empOne_PercentPay / 100);
        System.out.println(empOne_FirstName + empOne_LastName + "'s salary after the increase: " + empOne_PayIncrease);

        double empTwo_PayIncrease = empTwo_Salary * (1 + empTwo_PercentPay / 100);
        System.out.println(empOne_FirstName + empOne_LastName + "'s salary after the increase: " + empTwo_PayIncrease);
    }
}
