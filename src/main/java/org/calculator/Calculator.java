package org.calculator;

import org.calculator.myexception.IncorrectInput;
import org.calculator.myexception.UnsupportedOperator;

public interface Calculator {
    // Сделать ArabicCalculator, RomeCalculator, убрать default, удалить calculation
    String calculation(String number1, String operator, String number2)
            throws IncorrectInput, UnsupportedOperator;

    <T> String addition(T arabNumber1, T arabNumber2);

    <T> String subtraction(T arabNumber1, T arabNumber2);
}
