/*
Question:

Write a program that reads an employee name and two
amount of sales in Bahraini Dinar (BD) that represent
the total sales of the employee in each day over the
weekend (Friday and Saturday). Your program is then
required to print the employee name followed by the
percentages of sales on Friday and Saturday using
the below equations. Format the output so that all
numbers are printed with 2 decimal places.

• Friday Percentage = (Friday Sales ÷ (Friday Sales + Saturday Sales)) × 100
• Saturday Percentage = (Saturday Sales ÷ (Friday Sales + Saturday Sales)) × 100

Sample Input/Output:

Enter your name: Mustafa Ebrahim
Enter Friday and Saturday Sales: 1500.500 2000.780
Sales percentages of Mustafa Ebrahim are:
Friday is 42.86% and Saturday is 57.14%.
 */

import java.util.Scanner;

public class FriAndSatSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter Friday and Saturday Sales: ");
        double friSale = input.nextDouble() , satSale = input.nextDouble();

        //• Friday Percentage = (Friday Sales ÷ (Friday Sales + Saturday Sales)) × 100
        //• Saturday Percentage = (Saturday Sales ÷ (Friday Sales + Saturday Sales)) × 100
        double friPer = (friSale / (friSale + satSale)) * 100;
        double satPer = (satSale / (friSale + satSale)) * 100;

        System.out.println("Sales percentages of " + name + " are:");
        System.out.printf("Friday is %.2f" , friPer);
        System.out.printf("%% and Saturday is %.2f" , satPer);
        System.out.print("%.");
    }
}
