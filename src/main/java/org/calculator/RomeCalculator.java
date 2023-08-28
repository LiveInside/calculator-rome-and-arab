package org.calculator;

import java.io.IOException;
import java.util.Map;

public final class RomeCalculator implements Calculator, Converter {
    private final Map<String, Integer> numbersMap = Map.of(
            "I", 1,
            "II", 2,
            "III", 3,
            "IV", 4,
            "V", 5,
            "VI", 6,
            "VII", 7,
            "VIII", 8,
            "IX", 9,
            "X", 10);

    private final String[] arrayRomeNumbers = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

    @Override
    public String calculation(final String number1,
                              final String operator,
                              final String number2) throws UnsupportedOperationException, IOException {
        String result;

        if ((!numbersMap.containsKey(number1)) || !numbersMap.containsKey(number2)) {
            throw new IOException("Incorrect input of numbers");
        }

        switch (operator) {
            case "+" -> {
                int[] arabNumbers = toArab(number1, number2);
                int arabResult = addition(arabNumbers[0], arabNumbers[1]);
                result = toRome(arabResult);
            }
            case "-" -> {
                int[] arabNumbers = toArab(number1, number2);
                int arabResult = subtraction(arabNumbers[0], arabNumbers[1]);
                result = toRome(arabResult);
            }
            default -> throw new UnsupportedOperationException("Unsupported operator");
        }
        return result;
    }
    @Override
    public int[] toArab(final String number1, final String number2) {
        int[] arabNumbers = new int[2];

        arabNumbers[0] = numbersMap.get(number1);
        arabNumbers[1] = numbersMap.get(number2);

        return arabNumbers;
    }

    @Override
    public String toRome(final int arabResult) {
        return arrayRomeNumbers[arabResult];
    }

}
