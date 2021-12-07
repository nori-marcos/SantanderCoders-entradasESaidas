package com.letscode.questao3;

import java.util.Scanner;

public class Questao3 {
    public static void convertCelsiustoFahrenheit(){

        Scanner scanTemperatureInCelsius = new Scanner(System.in);
        System.out.print("It´s time to convert a temperature in Celsius to Fahrenheit, so insert a number: ");
        float temperatureInCelsius = Float.parseFloat(scanTemperatureInCelsius.nextLine());
        System.out.printf("%.2f°C is equivalent to %.2f°F.%n",
                temperatureInCelsius,
                ((temperatureInCelsius * 1.8f) + 32)
        );
    }
}
