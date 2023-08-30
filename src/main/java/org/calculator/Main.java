package org.calculator;

import org.calculator.enums.ModCalculator;
import org.calculator.exception.IncorrectInput;
import org.calculator.exception.IncorrectLaunch;
import org.calculator.exception.UnsupportedOperator;

import java.util.Scanner;
// Написать своё исключение, добавить exit, добавить цикл

public class Main {
    public static void main(final String[] args)
            throws IncorrectLaunch, IncorrectInput, UnsupportedOperator {

        ModCalculator mod = ModCalculator.getModByInput(args[0]);

        switch (mod) {
            case ARABIC -> { //todo: Необходимо реализовать калькулятор арабских чисел ;
            }
            case ROME -> {
                String exit;
                System.out.print("""
                        Это калькулятор римских чисел. Он может складывать и вычитать римские числа
                        Пример ввода: I + II
                        Пример вывода: III
                        Также при использовании данного калькулятора следует помнить о том, что среди римских чисел нет отрицательных и нуля.
                        Вместо нуля используется N от рим. nulla
                        """);
                while (true) {
                    System.out.print("Ввод: ");
                    Scanner userInput = new Scanner(System.in);
                    String[] operationLine = userInput.nextLine()
                            .toUpperCase()
                            .split(" ");
                    exit = operationLine[0];

                    if (exit.equalsIgnoreCase("exit")) {
                        System.out.println("Пока!");
                        break;
                    } else if (operationLine.length != 3) {
                        throw new IncorrectInput("Example Input \"I + II\"");
                    }

                    String number1 = operationLine[0];
                    String operator = operationLine[1];
                    String number2 = operationLine[2];
                    Calculator<String> romeCalculator = new RomeCalculator();

                    String result;

                    switch (operator) {
                        case "+" -> result = romeCalculator.addition(number1, number2);
                        case "-" -> result = romeCalculator.subtraction(number1, number2);
                        default -> throw new UnsupportedOperator("Supported operators only \"+\" and \"-\"");
                    }
                    System.out.println("Ответ: " + result);
                }
            } default -> throw new IncorrectLaunch("Example launch \"rome\" or \"arabic\"");
        }
    }
}

