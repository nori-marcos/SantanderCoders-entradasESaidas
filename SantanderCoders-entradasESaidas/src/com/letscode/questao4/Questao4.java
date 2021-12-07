package com.letscode.questao4;

import java.util.Scanner;

public class Questao4 {
    public static void convertBrazilianRealToUSDollars(){

        Scanner scanValue= new Scanner(System.in);
        System.out.print("Let's convert Brazilian Real to US Dollar. First, what is today's USD exchange rate: ");
        float USDExchangeRate = Float.parseFloat(scanValue.nextLine());

        System.out.print("How many reals do you want to convert to dollars? ");
        float valueInReal = Float.parseFloat(scanValue.nextLine());

        System.out.printf("Considering, today's USD exchange rate, R$%.2f are US$%.2f. %n",
                valueInReal,
                (valueInReal*USDExchangeRate));

    }
}
