package com.letscode.questao1;

import java.util.Scanner;

public class Questao1 {
    public static void calculator (){
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Let's get the basic arithmetic operations addition, subtraction, multiplication and division from two numbers.");
        System.out.print("First, insert a number: ");
        int firstNumber = Integer.parseInt((scanNumber.nextLine()));

        System.out.print("Second, insert another number: ");
        int secondNumber = Integer.parseInt((scanNumber.nextLine()));

        final int ADDITION = firstNumber + secondNumber;
        final int SUBTRACTION = firstNumber - secondNumber;
        final int MULTIPLICATION = firstNumber * secondNumber;
        final int DIVISION = firstNumber / secondNumber;

        System.out.printf(
                "From the inserted numbers, you have the following results: %n" +
                        "%d + %d = %d%n" +
                        "%d - %d = %d%n" +
                        "%d * %d = %d%n" +
                        "%d / %d = %d%n",
                firstNumber, secondNumber, ADDITION,
                firstNumber, secondNumber, SUBTRACTION,
                firstNumber, secondNumber, MULTIPLICATION,
                firstNumber, secondNumber, DIVISION);
    }
}
