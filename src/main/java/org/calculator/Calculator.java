package org.calculator;

import java.io.IOException;

public interface Calculator {
    String calculation(String number1, String operator, String number2) throws IOException;

   default int addition(int arabNumber1, int arabNumber2) {
       return arabNumber1 + arabNumber2;
   }

    default int subtraction(int arabNumber1, int arabNumber2) {
       return arabNumber1 - arabNumber2;
    }
}
