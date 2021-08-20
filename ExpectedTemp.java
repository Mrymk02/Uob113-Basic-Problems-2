/*
Question:

Write a Java program that will predict tomorrow’s
temperature given today’s temperature readings.
The program will first ask the user to enter two
values: the temperature median value and current
temperature reading. The program will calculate
and display the expected temperature according to
the following equation:

Expected temperature = 2 × median temperature − current temperature

Format your output to two decimal places.


Sample Input/Output:

Enter temperature median value and temperature reading:
39.61 36.92
Expected Temperature: 42.30
 */

import java.util.Scanner;

public class ExpectedTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature median value and temperature reading: ");
        double median = input.nextDouble() , current = input.nextDouble();

        double ExTemp = 2 * median - current;
        System.out.printf("Expected Temperature: %.2f" , ExTemp);

    }
}
