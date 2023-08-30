package org.calculator;

import org.calculator.converter.Converter;
import org.calculator.converter.RomeToArab;
import org.calculator.converter.ArabToRome;
import org.calculator.exception.IncorrectInput;

public final class RomeCalculator implements Calculator<String> {

    private final Converter<String, Integer> ROME_TO_ARAB_CONVERTER = new RomeToArab();
    private final Converter<Integer, String> ARAB_TO_ROME_CONVERTER = new ArabToRome();

    @Override
    public String addition(final String number1, final String number2) throws IncorrectInput {
        Integer arabNumber1 = ROME_TO_ARAB_CONVERTER.convert(number1);
        Integer arabNumber2 = ROME_TO_ARAB_CONVERTER.convert(number2);
        return ARAB_TO_ROME_CONVERTER.convert(arabNumber1 + arabNumber2);
    }

    @Override
    public String subtraction(final String number1, final String number2) throws IncorrectInput {
        Integer arabNumber1 = ROME_TO_ARAB_CONVERTER.convert(number1);
        Integer arabNumber2 = ROME_TO_ARAB_CONVERTER.convert(number2);
        try {
            return ARAB_TO_ROME_CONVERTER.convert(arabNumber1 - arabNumber2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Answer: N \n"
                    + "There are no negative numbers in Roman numerals");
            return "N";
        }

    }
}
