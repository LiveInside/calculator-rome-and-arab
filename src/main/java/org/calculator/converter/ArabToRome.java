package org.calculator.converter;

import static org.calculator.util.CollectionsOfNumbersUtil.ROME_NUMBERS;

public final class ArabToRome implements Converter<Integer, String> {
    @Override
    public String convert(final Integer arabNumber) {
        if (arabNumber < ROME_NUMBERS.length) {
            return ROME_NUMBERS[arabNumber];
        }
        return null;
    }
}
