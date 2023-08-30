package org.calculator.converter;

import static org.calculator.util.CollectionsOfNumbersUtil.ROME_NUMBERS;

public final class ArabToRome implements Converter<Integer, String> {
    @Override
    public String convert(final Integer arabNumber) {
        return ROME_NUMBERS[arabNumber];
    }
}
