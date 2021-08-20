/*
Question:

Write a program that reads two currency codes,
exchange rate from first currency to second and
the amount of money to be converted.Your program
should display the converted amount for each currency
using the following equations:

First Currency Amount = Currency Amount × Exchange Rate
Second Currency Amount = Currency Amount / Exchange Rate

Format the output to 4 decimal places.

Sample Input/Output
Enter currency codes: USD BD
Enter Exchange rate: 0.3774
Enter the amount: 125.0
USD 125.0000 = BD 47.1750
BD 125.0000 = USD 331.2136
 */

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double FirstC;
        double SecondC;
        double ExRate;
        double amount;

        System.out.print("Enter currency codes: ");
        String all_codes=input.nextLine();
        String[] Codes = all_codes.split(" ");

        System.out.print("Enter Exchange rate: ");
        ExRate = input.nextDouble();

        System.out.print("Enter the amount: ");
        amount = input.nextDouble();

        //First Currency Amount = Currency Amount × Exchange Rate
        FirstC = amount * ExRate;
        System.out.format(Codes[0]+" %.4f = "+Codes[1]+" %.4f\n",amount,FirstC);

        //Second Currency Amount = Currency Amount / Exchange Rate
        SecondC = amount / ExRate;
        System.out.format(Codes[1]+" %.4f = "+Codes[0]+" %.4f",amount,SecondC);
    }
}

/*
        /scan input for the country codes
        System.out.println("Enter currency codes: ");
        //store scanned codes in all_codes string
        //for eg. all_codes="USA BD"
        String all_codes=sc.nextLine();
        //Codes string array contain individual country Codes
        //for eg. Codes={"USA", "BD"}
        String[] Codes = all_codes.split(" ", 0);

        //take exchange_rate from user
        float exchange_rate,currency_amount,first_currency,second_currency;
        System.out.println("Enter Exchange Rate: ");
        exchange_rate=sc.nextFloat();

        //take amount from user
        System.out.println("Enter the Amount: ");
        currency_amount=sc.nextFloat();

        //calculation using the formula
        first_currency=currency_amount*exchange_rate;
        second_currency=currency_amount/exchange_rate;

        //following two lines prints output as uptil fourth decimal point
        System.out.format(Codes[0]+" %.4f = "+Codes[1]+" %.4f\n",currency_amount,first_currency);
        System.out.format(Codes[1]+" %.4f = "+Codes[0]+" %.4f",currency_amount,second_currency);
         */
