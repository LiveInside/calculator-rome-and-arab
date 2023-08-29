package org.calculator.converter;

public class ToRome implements Converter {
    private final String[] ROME_NUMBERS = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
    @Override
    public String convert(final Object ARAB_NUMBER) {
        return ROME_NUMBERS[(int) ARAB_NUMBER];
    }
}
