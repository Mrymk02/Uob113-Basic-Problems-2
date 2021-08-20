/*
Question:

ABC Phone Company, Inc., charges for phone calls by distance
(miles) and length of time (minutes). The cost of a call (in
Bahrain Dinar) is computed as 30% of the call weight, where
the call weight is computed by adding the time with 5% of the
distance. Design a JAVA program that reads the distance and
length of time for three phone calls. The program must
calculate and display the cost for each of the three calls
and the total cost of all three calls.

A sample Input/Output of your program is shown below.

Call 1: How many miles and minutes? 3 20
Call 2: How many miles and minutes? 2 15
Call 3: How many miles and minutes? 6 4
Call 1 costs BD. 6.045
Call 2 costs BD. 4.53
Call 3 costs BD. 1.29
Total cost is BD. 11.865
 */

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Call 1 input
        System.out.print("Call 1: How many miles and minutes? ");
        int distance1 = input.nextInt();
        int length1 = input.nextInt();

        double CallCost1 = (length1 + (0.05 * distance1)) * 0.30;

        //Call 2 input
        System.out.print("Call 2: How many miles and minutes? ");
        int distance2 = input.nextInt();
        int length2 = input.nextInt();

        double CallCost2 = (length2 + (0.05 * distance2)) * 0.30;

        //Call 3 input
        System.out.print("Call 3: How many miles and minutes? ");
        int distance3 = input.nextInt();
        int length3 = input.nextInt();

        double CallCost3 = (length3 + (0.05 * distance3)) * 0.30;

        //Call 1 output
        System.out.println("Call 1 costs BD. " + CallCost1);

        //Call 2 output
        System.out.println("Call 2 costs BD. " + CallCost2);

        //Call 3 output
        System.out.println("Call 3 costs BD. " + CallCost3);

        //Total Call Costs
        double totalCost = CallCost1 + CallCost2 + CallCost3;
        System.out.print("Total cost is BD. " + totalCost);
    }
}
