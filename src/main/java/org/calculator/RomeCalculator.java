package org.calculator;

import org.calculator.converter.Converter;
import org.calculator.converter.RomeToArab;
import org.calculator.converter.ArabToRome;
import org.calculator.myexception.IncorrectInput;

import java.util.Map;

// Наследоваться только от Calculator
public final class RomeCalculator<T> implements Calculator<T> {
    // Константы капсом и через нижнее подчёркивание
    private final Map<String, Integer> NUMBERS_MAP = Map.of(
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

    private final Converter<T, Integer> ARAB_CONVERTER = new RomeToArab<>();
    private final Converter<Integer, String> ROME_CONVERTER = new ArabToRome<>();

    @Override
    public String addition(final T NUMBER_1, final T NUMBER_2) throws IncorrectInput {
        if ((!NUMBERS_MAP.containsKey(NUMBER_1.toString()))
                || !NUMBERS_MAP.containsKey(NUMBER_2.toString())) {
            throw new IncorrectInput("\"" + NUMBER_1 + "\"" + " or " + "\"" + NUMBER_2 + "\""
                    + " Incorrect." + "Correct numbers only: roman I-X");
        }
        Integer arabNumber1 = ARAB_CONVERTER.convert(NUMBER_1);
        Integer arabNumber2 = ARAB_CONVERTER.convert(NUMBER_2);
        return ROME_CONVERTER.convert(arabNumber1 + arabNumber2);
    }

    @Override
    public String subtraction(final T NUMBER_1, final T NUMBER_2) throws IncorrectInput {
        if ((!NUMBERS_MAP.containsKey(NUMBER_1.toString()))
                || !NUMBERS_MAP.containsKey(NUMBER_2.toString())) {
            throw new IncorrectInput("\"" + NUMBER_1 + "\"" + " or " + "\"" + NUMBER_2 + "\""
                    + " Incorrect." + "Correct numbers only: roman I-X");
        }
        Integer arabNumber1 = ARAB_CONVERTER.convert(NUMBER_1);
        Integer arabNumber2 = ARAB_CONVERTER.convert(NUMBER_2);
        try {
            return ROME_CONVERTER.convert(arabNumber1 - arabNumber2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Answer: N \n"
                    + "There are no negative numbers in Roman numerals");
            return "N";
        }

    }
}
