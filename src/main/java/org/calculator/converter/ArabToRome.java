package org.calculator.converter;

public final class ArabToRome implements Converter<Integer, String> {
    private final String[] ROME_NUMBERS = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
    @Override
    public String convert(final Integer arabNumber) {
        return ROME_NUMBERS[arabNumber];
    }
}
