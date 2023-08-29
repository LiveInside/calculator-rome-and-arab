package org.calculator.converter;

import java.util.Map;

public final class RomeToArab implements Converter<String, Integer> {
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
    public Integer convert(String romanNumeral) {
        return NUMBERS_MAP.get(romanNumeral);
    }
}
