/*
Question:

One large chemical company pays its
salespeople on a commission basis.
The salespeople receive BD. 75/600
per week plus 9% of their gross sales for
that week. For example, a salesperson
who sells BD. 1890/— worth of chemicals in a week
receives BD. 75/600 plus 9% of 1890/—, or a total
of 75/600 + 170/100 = 245/700.

Develop a program that will input each salesperson’s
gross sales for last week and will calculate and display
that salesperson’s earnings?
 */

import java.util.Scanner;

public class SalesPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BD = 75/600;
        System.out.println("Enter each salesperson’s gross sales for last week: ");
        double salesGross = input.nextDouble();

        double salespersonearnings = BD + 0.09 * salesGross;
        System.out.println(salespersonearnings);
    }
}
