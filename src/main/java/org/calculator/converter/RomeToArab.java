package org.calculator.converter;

import org.calculator.exception.IncorrectInput;

import static org.calculator.util.CollectionsOfNumbersUtil.NUMBERS_MAP;

public final class RomeToArab implements Converter<String, Integer> {

    @Override
    public Integer convert(final String romanNumeral) throws IncorrectInput {
        if ((!NUMBERS_MAP.containsKey(romanNumeral))) {
            throw new IncorrectInput("Correct numbers only: roman I-X");
        }
        return NUMBERS_MAP.get(romanNumeral);
    }

}
