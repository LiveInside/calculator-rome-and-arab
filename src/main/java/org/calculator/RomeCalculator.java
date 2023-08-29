package org.calculator;

import org.calculator.converter.ToArab;
import org.calculator.converter.ToRome;
import org.calculator.myexception.IncorrectInput;

import java.util.Map;

// Наследоваться только от Calculator
public final class RomeCalculator implements Calculator {
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

    private final ToArab ARAB_CONVERTER = new ToArab();
    private final ToRome ROME_CONVERTER = new ToRome();

    @Override
    public String addition(Object NUMBER_1, Object NUMBER_2) throws IncorrectInput {
        if ((!NUMBERS_MAP.containsKey(NUMBER_1.toString()))
                || !NUMBERS_MAP.containsKey(NUMBER_2.toString())) {
            throw new IncorrectInput("\"" + NUMBER_1 + "\"" + " or " + "\"" + NUMBER_2 + "\"" +
                    " Incorrect." +
                    "Correct numbers only: roman I-X");
        }
        Integer arabNumber1 = ARAB_CONVERTER.convert(NUMBER_1);
        Integer arabNumber2 = ARAB_CONVERTER.convert(NUMBER_2);
        return ROME_CONVERTER.convert(arabNumber1 + arabNumber2);
    }

    @Override
    public String subtraction(Object NUMBER_1, Object NUMBER_2) throws IncorrectInput{
        if ((!NUMBERS_MAP.containsKey(NUMBER_1.toString()))
                || !NUMBERS_MAP.containsKey(NUMBER_2.toString())) {
            throw new IncorrectInput("\"" + NUMBER_1 + "\"" + " or " + "\"" + NUMBER_2 + "\"" +
                    " Incorrect." +
                    "Correct numbers only: roman I-X");
        }
        Integer arabNumber1 = ARAB_CONVERTER.convert(NUMBER_1);
        Integer arabNumber2 = ARAB_CONVERTER.convert(NUMBER_2);
        return ROME_CONVERTER.convert(arabNumber1 - arabNumber2);
    }
}
