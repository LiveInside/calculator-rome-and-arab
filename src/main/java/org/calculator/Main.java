package org.calculator;

import org.calculator.myexception.IncorrectInput;
import org.calculator.myexception.IncorrectLaunch;
import org.calculator.myexception.UnsupportedOperator;

import java.util.Scanner;

// Написать своё исключение, добавить exit, добавить цикл

public class Main {
    public static void main(final String[] args)
            throws IncorrectLaunch, IncorrectInput, UnsupportedOperator {

        switch (args[0]) {
            case "arabic" -> throw new IncorrectLaunch("Not implemented yet");
            case "rome" -> {
                String exit;
                while (true) {
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Input operation. Example: \"I + II\"");
                    String[] operationLine = userInput.nextLine()
                            .toUpperCase()
                            .split(" ");
                    exit = operationLine[0];

                    if (exit.equalsIgnoreCase("exit")) {
                        System.out.println("Goodbye!");
                        break;
                    } else if (operationLine.length != 3) {
                        throw new IncorrectInput("Example Input: \"I + II\"");
                    }

                    String number1 = operationLine[0];
                    String operator = operationLine[1];
                    String number2 = operationLine[2];
                    Calculator<String> romeCalculator = new RomeCalculator<>();

                    String result;

                    switch (operator) {
                        case "+" -> result = romeCalculator.addition(number1, number2);
                        case "-" -> result = romeCalculator.subtraction(number1, number2);
                        default -> throw new UnsupportedOperator("\"" + operator + "\""
                                + " Unsupported operator. " + "Supported operators only: \"+\" and \"-\"");
                    }
                    System.out.println("Answer: " + result);
                }
            } default -> throw new IncorrectLaunch("\"" + args[0] + "\"" + " IncorrectLaunch. "
                    + "Example launch: \"rome\" or \"arabic\"");
        }
    }
}
