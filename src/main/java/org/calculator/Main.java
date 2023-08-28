package org.calculator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        if (args.length != 3) {
            throw new IndexOutOfBoundsException("Invalid input. Example input: \"I + II\"");
        }

        String number1 = args[0].toUpperCase();
        String number2 = args[2].toUpperCase();
        String operator = args[1];

        RomeCalculator romeCalculator = new RomeCalculator();
        System.out.println(romeCalculator.calculation(number1, number2, operator));
    }
}
