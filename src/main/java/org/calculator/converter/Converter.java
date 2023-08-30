package org.calculator.converter;

import org.calculator.exception.IncorrectInput;

public interface Converter<INPUT, OUTPUT> {

    OUTPUT convert(INPUT number) throws IncorrectInput;
}
