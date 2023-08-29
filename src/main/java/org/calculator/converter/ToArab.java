package org.calculator.converter;

import java.util.Map;

public class ToArab implements Converter {
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
    public Integer convert(final Object ROMAN_NUMERAl) {
        return NUMBERS_MAP.get(ROMAN_NUMERAl.toString());
    }
}
