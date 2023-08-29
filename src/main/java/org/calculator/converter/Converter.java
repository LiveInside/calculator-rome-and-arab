package org.calculator.converter;

public interface Converter<Input, Output> {
    // сделать типизированый тип из 1 типа в другой, оставить 1 метод "T convert(E e)"

    // 1 интерфейс 2 реализации в классе конвертер или 2 класса и в каждом реализация?

    Output convert(Input number);
}
