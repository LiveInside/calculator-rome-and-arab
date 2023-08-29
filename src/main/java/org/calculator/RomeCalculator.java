package org.calculator;

import org.calculator.converter.Converter;
import org.calculator.converter.RomeToArab;
import org.calculator.converter.ArabToRome;
import org.calculator.exception.IncorrectInput;

import java.util.Map;

// Наследоваться только от Calculator
public final class RomeCalculator implements Calculator<String> {
    // Константые только поля класса капсом и через нижнее подчёркивание
    private final Map<java.lang.String, Integer> NUMBERS_MAP = Map.of(
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

    private final Converter<String, Integer> ARAB_CONVERTER = new RomeToArab();
    private final Converter<Integer, String> ROME_CONVERTER = new ArabToRome();

    @Override
    public java.lang.String addition(final String number1, final String number2) throws IncorrectInput {
        if ((!NUMBERS_MAP.containsKey(number1))
                || !NUMBERS_MAP.containsKey(number2)) {
            throw new IncorrectInput("Correct numbers only: roman I-X");
        }
        Integer arabNumber1 = ARAB_CONVERTER.convert(number1);
        Integer arabNumber2 = ARAB_CONVERTER.convert(number2);
        return ROME_CONVERTER.convert(arabNumber1 + arabNumber2);
    }

    @Override
    public java.lang.String subtraction(final String number1, final String number2) throws IncorrectInput {
        if ((!NUMBERS_MAP.containsKey(number1))
                || !NUMBERS_MAP.containsKey(number2)) {
            throw new IncorrectInput("Correct numbers only roman I-X");
        }
        Integer arabNumber1 = ARAB_CONVERTER.convert(number1);
        Integer arabNumber2 = ARAB_CONVERTER.convert(number2);
        try {
            return ROME_CONVERTER.convert(arabNumber1 - arabNumber2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Answer: N \n"
                    + "There are no negative numbers in Roman numerals");
            return "N";
        }

    }
}
