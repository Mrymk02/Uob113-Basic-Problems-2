/*
Question:

Write a program that reads from the keyboard
two integers representing hours and minutes.
The program should convert the time (hours
and minutes) to seconds. Your program should
write the result on screen as shown in the
sample I/O below. the sample below:

Sample Input/Output
Hours? 10
Minutes? 15
Time in Seconds = 36900
 */
import java.util.Scanner;

public class TimeInSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //two integers representing hours and minutes.
        int hours;
        int minutes;

        System.out.print("Hours? ");
        hours = input.nextInt();

        System.out.print("Minutes? ");
        minutes = input.nextInt();

        int seconds = (hours * 3600) + (minutes * 60);
        System.out.println("Time in Seconds = " + seconds);
    }
}
