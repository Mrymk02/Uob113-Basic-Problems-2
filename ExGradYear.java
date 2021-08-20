/*
Question:

The curriculum of any bachelor degree program
consists of credit points which must be completed
by all students enrolled in the program. Write
a program that will ask the user to enter his/her
name, program credit, and expected credits to
be completed yearly. The program will then
calculate degree duration in years. The duration
in years is calculated by:

Degree duration in years = program credits ÷ expected credits to be completed yearly

The program will display the student name,
degree duration in years, and expected graduation
year formatted similar to the below sample output.
Expected graduation year equals the year 2015 plus
degree duration.

Sample Input/Output
Enter your name, program credits and expected credits:
Ali 130 30
Name: Ali
Degree duration: 4 years
Expected graduation year: 2019
*/

import java.util.Scanner;

public class ExGradYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int Pcredits;
        int Excredits;

        System.out.println("Enter your name, program credits and expected credits: ");
        name = input.next();
        Pcredits = input.nextInt();
        Excredits = input.nextInt();

        System.out.println("Name: " + name);

        //Degree duration in years = program credits ÷ expected credits to be completed yearly
        int DegreeDuration = Pcredits / Excredits;
        System.out.println("Degree duration: " + DegreeDuration);

        //Expected graduation year equals the year 2015 plus degree duration.
        int ExGradYear = 2015 + DegreeDuration;
        System.out.println("Expected graduation year: " + ExGradYear);

    }
}
