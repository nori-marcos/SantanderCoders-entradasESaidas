package com.letscode.questao2;

import java.util.Scanner;

public class Questao2 {
    public static void getMultiplicationTable(){

        System.out.print("Now, let's create a multiplication table from 1 to 10 for the number: ");
        Scanner scanNumber = new Scanner(System.in);
        int number = Integer.parseInt(scanNumber.nextLine());

        final int timesOne = number*1;
        final int timesTwo = number*2;
        final int timesThree = number*3;
        final int timesFour = number*4;
        final int timesFive = number*5;
        final int timesSix = number*6;
        final int timesSeven = number*7;
        final int timesEight = number*8;
        final int timesNine = number*9;
        final int timesTen = number*10;


        System.out.printf(
                "The multiplication table of number %d is:%n" +
                        "%d x 1 = %d %n" +
                        "%d x 2 = %d %n" +
                        "%d x 3 = %d %n" +
                        "%d x 4 = %d %n" +
                        "%d x 5 = %d %n" +
                        "%d x 6 = %d %n" +
                        "%d x 7 = %d %n" +
                        "%d x 8 = %d %n" +
                        "%d x 9 = %d %n" +
                        "%d x 10 = %d %n",
                number,
                number, timesOne,
                number, timesTwo,
                number, timesThree,
                number, timesFour,
                number, timesFive,
                number, timesSix,
                number, timesSeven,
                number, timesEight,
                number, timesNine,
                number, timesTen
        );
    }
}
