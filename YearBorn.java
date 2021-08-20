/*
Question:

Write a program that reads from the
keyboard the following input:
• Person Full Name written in a single line.
• Person CPR number (9-Digits) written in the next.
Your program should find and print
on screen the birth year of this person.
The birth year can be extracted from the
first two digits of the CPR. Assume all
persons were born before the year 2000
and after the year 1910.

Sample Input/Output
Enter your name: Jassim Ali Ahmed
Enter your CPR: 740707573
Jassim Ali Ahmed was born in year 1974
 */

import java.util.Scanner;

public class YearBorn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String CPR;
        //• Person Full Name written in a single line.
        //• Person CPR number (9-Digits) written in the next.
        System.out.print("Enter your name : ");
        name = input.nextLine();

        System.out.print("Enter your CPR: ");
        CPR = input.next();

        System.out.println(name + " was born in year 19" + CPR.substring(0,2));
    }
}
