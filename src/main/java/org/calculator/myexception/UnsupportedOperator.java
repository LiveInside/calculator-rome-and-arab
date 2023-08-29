package org.calculator.myexception;

import java.io.IOException;

public class UnsupportedOperator extends IOException {
   public UnsupportedOperator(final String message) {
        super(message);
    }
}
