package org.calculator.converter;

public final class ArabToRome<Input, Output> implements Converter<Input, Output> {
    private final String[] ROME_NUMBERS = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
    @Override
    public Output convert(final Input ARAB_NUMBER) {
        return (Output) ROME_NUMBERS[(int) ARAB_NUMBER];
    }
}
