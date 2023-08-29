package org.calculator.converter;

import java.util.Map;

public final class RomeToArab<Input, Output> implements Converter<Input, Output> {
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

    @Override
    public Output convert(final Input ROMAN_NUMERAl) {
        return (Output) NUMBERS_MAP.get(ROMAN_NUMERAl.toString());
    }
}
