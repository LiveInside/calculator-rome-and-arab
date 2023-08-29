package org.calculator;

import org.calculator.myexception.IncorrectInput;

public interface Calculator {
    // Сделать ArabicCalculator, RomeCalculator, убрать default, удалить calculation

    <T> String addition(T arabNumber1, T arabNumber2) throws IncorrectInput;

    <T> String subtraction(T arabNumber1, T arabNumber2) throws IncorrectInput;
}
