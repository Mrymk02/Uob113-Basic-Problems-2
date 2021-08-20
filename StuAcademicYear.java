/*
Question:

Write a program that reads a student name
followed by his/her id. The program should
then display on screen the student’s name
followed by his/her academic year.

For example,
the academic year for the id 20102323 is 2010.
 */

import java.util.Scanner;

public class StuAcademicYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String In;

        System.out.println("Enter Student name and id: ");
        In = input.nextLine();
        String[] name_id = In.split(" ");

        System.out.println(name_id[0]+" "+name_id[1].substring(0,4));

    }
}
