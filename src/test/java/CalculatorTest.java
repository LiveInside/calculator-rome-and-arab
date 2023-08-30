import org.calculator.Calculator;
import org.calculator.RomeCalculator;
import org.calculator.converter.Converter;
import org.calculator.converter.RomeToArab;
import org.calculator.converter.ArabToRome;
import org.calculator.exception.IncorrectInput;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator<String> romeCalculator = new RomeCalculator();
    Converter<String, Integer> arabConverter = new RomeToArab();
    Converter<Integer, String> romeConverter = new ArabToRome();
    @Test
    public void testRomeToArab() throws IncorrectInput {
        int[] arabNumbers = {5, 3};
        int arabNumber1 = arabConverter.convert("V");
        int arabNumber2 = arabConverter.convert("III");
        assertThat(arabNumber1)
                .isEqualTo(arabNumbers[0]);
        assertThat(arabNumber2)
                .isEqualTo(arabNumbers[1]);
    }
    @Test
    public void testArabToRome() throws IncorrectInput {
        assertThat(romeConverter.convert(7))
                .isEqualTo("VII");
    }
    @Test
    public void testRomeCalculator() throws Exception {
        assertThat(romeCalculator.addition("I", "I"))
                .isEqualTo("II");
        assertThat(romeCalculator.addition("I", "II"))
                .isEqualTo("III");
        assertThat(romeCalculator.addition("I", "III"))
                .isEqualTo("IV");
        assertThat(romeCalculator.addition("I", "IV"))
                .isEqualTo("V");
        assertThat(romeCalculator.addition("I", "V"))
                .isEqualTo("VI");
        assertThat(romeCalculator.addition("I", "VI"))
                .isEqualTo("VII");
        assertThat(romeCalculator.addition("I", "VII"))
                .isEqualTo("VIII");
        assertThat(romeCalculator.addition("I", "VIII"))
                .isEqualTo("IX");
        assertThat(romeCalculator.addition("I", "IX"))
                .isEqualTo("X");
        assertThat(romeCalculator.addition("I", "X"))
                .isEqualTo("XI");
        assertThat(romeCalculator.addition("II", "II"))
                .isEqualTo("IV");
        assertThat(romeCalculator.addition("II", "III"))
                .isEqualTo("V");
        assertThat(romeCalculator.addition("II", "IV"))
                .isEqualTo("VI");
        assertThat(romeCalculator.addition("II", "V"))
                .isEqualTo("VII");
        assertThat(romeCalculator.addition("II", "VI"))
                .isEqualTo("VIII");
        assertThat(romeCalculator.addition("II", "VII"))
                .isEqualTo("IX");
        assertThat(romeCalculator.addition("II", "VIII"))
                .isEqualTo("X");
        assertThat(romeCalculator.addition("II", "IX"))
                .isEqualTo("XI");
        assertThat(romeCalculator.addition("II", "X"))
                .isEqualTo("XII");
        assertThat(romeCalculator.addition("III", "III"))
                .isEqualTo("VI");
        assertThat(romeCalculator.addition("III", "IV"))
                .isEqualTo("VII");
        assertThat(romeCalculator.addition("III", "V"))
                .isEqualTo("VIII");
        assertThat(romeCalculator.addition("III", "VI"))
                .isEqualTo("IX");
        assertThat(romeCalculator.addition("III", "VII"))
                .isEqualTo("X");
        assertThat(romeCalculator.addition("III", "VIII"))
                .isEqualTo("XI");
        assertThat(romeCalculator.addition("III", "IX"))
                .isEqualTo("XII");
        assertThat(romeCalculator.addition("III", "X"))
                .isEqualTo("XIII");
        assertThat(romeCalculator.addition("IV", "IV"))
                .isEqualTo("VIII");
        assertThat(romeCalculator.addition("IV", "V"))
                .isEqualTo("IX");
        assertThat(romeCalculator.addition("IV", "VI"))
                .isEqualTo("X");
        assertThat(romeCalculator.addition("IV", "VII"))
                .isEqualTo("XI");
        assertThat(romeCalculator.addition("IV", "VIII"))
                .isEqualTo("XII");
        assertThat(romeCalculator.addition("IV", "IX"))
                .isEqualTo("XIII");
        assertThat(romeCalculator.addition("IV", "X"))
                .isEqualTo("XIV");
        assertThat(romeCalculator.addition("V", "V"))
                .isEqualTo("X");
        assertThat(romeCalculator.addition("V", "VI"))
                .isEqualTo("XI");
        assertThat(romeCalculator.addition("V", "VII"))
                .isEqualTo("XII");
        assertThat(romeCalculator.addition("V", "VIII"))
                .isEqualTo("XIII");
        assertThat(romeCalculator.addition("V", "IX"))
                .isEqualTo("XIV");
        assertThat(romeCalculator.addition("V", "X"))
                .isEqualTo("XV");
        assertThat(romeCalculator.addition("VI", "VI"))
                .isEqualTo("XII");
        assertThat(romeCalculator.addition("VI", "VII"))
                .isEqualTo("XIII");
        assertThat(romeCalculator.addition("VI", "VIII"))
                .isEqualTo("XIV");
        assertThat(romeCalculator.addition("VI", "IX"))
                .isEqualTo("XV");
        assertThat(romeCalculator.addition("VI", "X"))
                .isEqualTo("XVI");
        assertThat(romeCalculator.addition("VII", "VII"))
                .isEqualTo("XIV");
        assertThat(romeCalculator.addition("VII", "VIII"))
                .isEqualTo("XV");
        assertThat(romeCalculator.addition("VII", "IX"))
                .isEqualTo("XVI");
        assertThat(romeCalculator.addition("VII", "X"))
                .isEqualTo("XVII");
        assertThat(romeCalculator.addition("VIII", "VIII"))
                .isEqualTo("XVI");
        assertThat(romeCalculator.addition("VIII", "IX"))
                .isEqualTo("XVII");
        assertThat(romeCalculator.addition("VIII", "X"))
                .isEqualTo("XVIII");
        assertThat(romeCalculator.addition("IX", "IX"))
                .isEqualTo("XVIII");
        assertThat(romeCalculator.addition("IX", "X"))
                .isEqualTo("XIX");
        assertThat(romeCalculator.addition("X", "X"))
                .isEqualTo("XX");
        assertThat(romeCalculator.subtraction("X", "III"))
                .isEqualTo("VII");
        assertThat(romeCalculator.subtraction("V", "V"))
                .isEqualTo("N");
        assertThat(romeCalculator.subtraction("I", "I"))
                .isEqualTo("N");
        assertThat(romeCalculator.subtraction("X", "X"))
                .isEqualTo("N");
        assertThat(romeCalculator.subtraction("VII", "VIII"))
                .isEqualTo("N");
    }
}
