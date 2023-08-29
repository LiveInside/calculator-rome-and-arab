import org.calculator.RomeCalculator;
import org.calculator.converter.ToArab;
import org.calculator.converter.ToRome;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    RomeCalculator romeCalculator = new RomeCalculator();
    ToArab arabConverter = new ToArab();
    ToRome romeConverter = new ToRome();
    @Test
    public void testToArab() {
        int[] arabNumbers = {5, 3};
        int arabNumber1 = arabConverter.convert("V");
        int arabNumber2 = arabConverter.convert("III");
        assertThat(arabNumber1)
                .isEqualTo(arabNumbers[0]);
        assertThat(arabNumber2)
                .isEqualTo(arabNumbers[1]);
    }
    @Test
    public void testToRome() {
        assertThat(romeConverter.convert(7))
                .isEqualTo("VII");
    }
    @Test
    public void testCalculation() throws IOException {
        assertThat(romeCalculator.calculation("V", "+", "V"))
                .isEqualTo("X");
        assertThat(romeCalculator.calculation("X", "-", "III"))
                .isEqualTo("VII");
        assertThat(romeCalculator.calculation("V", "-", "V"))
                .isEqualTo("N");
    }
}
