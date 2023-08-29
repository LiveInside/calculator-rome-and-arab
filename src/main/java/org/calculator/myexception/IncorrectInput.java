package org.calculator.myexception;

import java.io.IOException;

public class IncorrectInput extends IOException {
    public IncorrectInput(String message){
        super(message);
    }
}
