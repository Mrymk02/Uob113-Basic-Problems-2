/*
Question:

The manager of a football stadium wants you to
write a program that calculates the total ticket
sales for a game.

There are four types of tickets – Box, Sideline,
Premium, and general Admission. Data is stored
as shown below:

250 5750
100 28000
50 35750
25 18750

The first line indicates the ticket price is
$250 and that 5750 tickets were sold at that
price. Output the number of tickets sold and
the total sale amount. Format your output with
two decimal places.
 */

import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saleAmount = 0;
        double ticketPrice;
        int ticketsSold;

        int numberOfTicketsSold = 0;

        //first input
        ticketPrice = input.nextDouble();
        ticketsSold = input.nextInt();

        saleAmount += ticketPrice * ticketsSold;
        numberOfTicketsSold += ticketsSold;

        //second input
        ticketPrice = input.nextDouble();
        ticketsSold = input.nextInt();

        saleAmount += ticketPrice * ticketsSold;
        numberOfTicketsSold += ticketsSold;

        //third input
        ticketPrice = input.nextDouble();
        ticketsSold = input.nextInt();

        saleAmount += ticketPrice * ticketsSold;
        numberOfTicketsSold += ticketsSold;

        //forth input
        ticketPrice = input.nextDouble();
        ticketsSold = input.nextInt();

        saleAmount += ticketPrice * ticketsSold;
        numberOfTicketsSold += ticketsSold;

        System.out.println("Number of tickets sold = " + numberOfTicketsSold);
        System.out.printf("Sale amount = $%.2f" , saleAmount);
    }
}

/*
output:

Number of tickets sold = 88250
Sale amount = $6493750.00
 */