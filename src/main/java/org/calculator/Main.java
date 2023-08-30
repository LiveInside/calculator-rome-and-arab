package org.calculator;

import org.calculator.enums.ModCalculator;
import org.calculator.exception.IncorrectInput;
import org.calculator.exception.IncorrectLaunch;
import org.calculator.exception.UnsupportedOperator;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final String EXIT = "exit";
    private static final Calculator<String> ROME_CALCULATOR = new RomeCalculator();
    public static void main(final String[] args)
            throws IncorrectLaunch, IncorrectInput, UnsupportedOperator {

        ModCalculator mod = ModCalculator.getModByInput(args[0]);
        switch (mod) {
            case ARABIC -> { //todo: Необходимо реализовать калькулятор арабских чисел;
            }
            case ROME -> {
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

                    if (EXIT.equalsIgnoreCase(operationLine[0])) {
                        System.out.println("Пока!");
                        break;
                    } else if (operationLine.length != 3) {
                        throw new IncorrectInput("Example Input \"I + II\"");
                    }

                    String number1 = operationLine[0];
                    String operator = operationLine[1];
                    String number2 = operationLine[2];

                    String result;

                    switch (operator) {
                        case "+" -> result = ROME_CALCULATOR.addition(number1, number2);
                        case "-" -> result = ROME_CALCULATOR.subtraction(number1, number2);
                        default -> throw new UnsupportedOperator("Supported operators only \"+\" and \"-\"");
                    }
                    if (Objects.isNull(result)) {
                        throw new IncorrectInput("Не удалось произвести вычисления");
                    }
                    System.out.println("Ответ: " + result);
                }
            } default -> throw new IncorrectLaunch("Example launch \"rome\" or \"arabic\"");
        }
    }
}

