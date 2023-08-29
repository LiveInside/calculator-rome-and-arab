package org.calculator;

import org.calculator.exception.IncorrectInput;

public interface Calculator<T> {
    // Сделать ArabicCalculator, RomeCalculator, убрать default, удалить calculation

    String addition(T number1, T number2) throws IncorrectInput;

    String subtraction(T number1, T number2) throws IncorrectInput;
}
