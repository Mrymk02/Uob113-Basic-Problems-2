/*
Question:

Write a program that reads three salaries from
the keyboard and displays their average on screen
formatted with 3 decimal places as shown below in
the sample I/O.

Sample Input/Output:
Salary1 ...........456.400
Salary2 ..........1230.520
Salary3 ...........650.550
Average ...........779.157
 */

import java.util.Scanner;

public class SalaryAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Salary1, Salary2, Salary3;

        System.out.print("Salary1 ...........");
        Salary1 = input.nextDouble();

        System.out.print("Salary2 ..........");
        Salary2 = input.nextDouble();

        System.out.print("Salary3 ...........");
        Salary3 = input.nextDouble();

        double Average = (Salary1 + Salary2 + Salary3) / 3;
        System.out.printf("Average ...........%.3f" , Average);
    }
}
