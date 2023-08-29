package org.calculator.myexception;

import java.io.IOException;

public class IncorrectLaunch extends IOException {
    public IncorrectLaunch(String message) {
        super(message);
    }
}
