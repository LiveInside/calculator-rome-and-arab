package org.calculator;

import org.calculator.exception.IncorrectInput;

public interface Calculator<T> {

    String addition(T number1, T number2) throws IncorrectInput;

    String subtraction(T number1, T number2) throws IncorrectInput;
}
