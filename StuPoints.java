/*
Question:

Students are awarded points toward their grades
based upon the addition of the average of three
quizzes(Q1, Q2, Q3), the midterm exam (MT), and
the final exam (FINAL). Quizzes are marked out
of 5, the midterm is out of 30, and the final
is out of 70. Compute the total points using a
Java program and print the result out of 100
according to the following percentages:
Quizzes: 25%,
Midterm: 35%,
Final: 40%.
 */

import java.util.Scanner;

public class StuPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Q1, Q2, Q3;
        double MT;
        double FINAL;

        System.out.println("Enter marks of Quiz 1 out of 5: ");
        Q1 = input.nextInt();

        System.out.println("Enter marks of Quiz 2 out of 5: ");
        Q2 = input.nextInt();

        System.out.println("Enter marks of Quiz 3 out of 5: ");
        Q3 = input.nextInt();

        System.out.println("Enter marks of the midterm out of 30: ");
        MT = input.nextInt();

        System.out.println("Enter marks of the final out of 70: ");
        FINAL = input.nextInt();

        double average = (Q1 + Q2 + Q3) / 3;
        double tQuizzes = (average * 25) / 5;
        double tMT = (MT * 35) / 30;
        double tFinal = (FINAL * 40) / 70;
        double total = tFinal + tMT + tQuizzes;

        System.out.println("Quizzes: 25% = " + tQuizzes + "%");
        System.out.println("Midterm: 35% = " + tMT + "%");
        System.out.println("Final: 40% = " + tFinal + "%");

        System.out.println("Total points out of 100: " + total);
    }

}
