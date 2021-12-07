package com.letscode.questao5;

import java.util.Scanner;

public class Questao5 {
    public static void convertInchesToCentimeters(){

        Scanner scanInches = new Scanner(System.in);
        System.out.print("Let's convert a number in inches to centimeters, so insert a number: ");
        float valueInInches = Float.parseFloat(scanInches.nextLine());

        final float CENTIMETER_FACTOR_CONVERSION = 2.54f;

        System.out.printf("%.2f inches is equal to %.2f centimeters.%n",
                valueInInches,
                (valueInInches*CENTIMETER_FACTOR_CONVERSION)
                );
    }
}
