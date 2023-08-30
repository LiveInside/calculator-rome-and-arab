package org.calculator.enums;

import org.calculator.exception.IncorrectLaunch;

public enum ModCalculator {
    ROME("rome"),
    ARABIC("arabic");

    private final String MOD_NAME;

    ModCalculator(final String modName) {
        this.MOD_NAME = modName;
    }

    public String getModName() {
        return MOD_NAME;
    }

    public static ModCalculator getModByInput(final String launchInput) throws IncorrectLaunch {
        for (ModCalculator mod : values()) {
            if (mod.getModName().equalsIgnoreCase(launchInput)) {
                return mod;
            }
        }
        throw new IncorrectLaunch("Example launch \"rome\" or \"arabic\"");
    }
}
