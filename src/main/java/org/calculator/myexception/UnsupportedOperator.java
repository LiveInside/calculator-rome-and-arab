package org.calculator.myexception;

import java.io.IOException;

public class UnsupportedOperator extends IOException {
   public UnsupportedOperator(String message) {
        super(message);
    }
}
