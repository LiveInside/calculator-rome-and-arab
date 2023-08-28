import org.calculator.RomeCalculator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    RomeCalculator romeCalculator = new RomeCalculator();
    @Test
    public void testToArab() {
        int[] arabNumbers = {5, 1};
        assertThat(romeCalculator.toArab("V", "I"))
                .isEqualTo(arabNumbers);
    }
    @Test
    public void testToRome() {
        assertThat(romeCalculator.toRome(7))
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
