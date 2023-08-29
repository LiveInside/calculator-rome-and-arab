package org.calculator;

import org.calculator.myexception.IncorrectInput;
import org.calculator.myexception.IncorrectLaunch;
import org.calculator.myexception.UnsupportedOperator;

import java.util.Scanner;

// Написать своё исключение, добавить exit, добавить цикл

public class Main {
    public static void main(final String[] args)
            throws IncorrectLaunch, IncorrectInput, UnsupportedOperator {
        System.out.println(args[0]);
        if (!args[0].equalsIgnoreCase("rome")
                && !args[0].equalsIgnoreCase("arabic")) {
            throw new IncorrectLaunch("\"" + args[0] + "\"" + " IncorrectLaunch. " +
                    "Example launch: \"rome\" or \"arabic\"");
        }

        switch (args[0]) {
            case "arabic" -> throw new IncorrectLaunch("Not implemented yet");
            case "rome" -> {
                String exit;
                while (true) {
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Input operation. Example: \"I + II\"");
                    String[] operationLine = userInput.nextLine().split(" ");
                    exit = operationLine[0];

                    if (exit.equalsIgnoreCase("exit")) {
                        System.out.println("Goodbye!");
                        break;
                    }

                    String numbers1 = operationLine[0];
                    String operator = operationLine[1];
                    String numbers2 = operationLine[2];
                    RomeCalculator romeCalculator = new RomeCalculator();
                    System.out.println(romeCalculator.calculation(numbers1, operator, numbers2));
                }
            }
        }
    }
}
