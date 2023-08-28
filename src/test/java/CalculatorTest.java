import org.calculator.Main;
import org.calculator.RomeCalculator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    final Map<String, Integer> numbersMap = Map.of(
            "I", 1,
            "II", 2,
            "III", 3,
            "IV", 4,
            "V", 5,
            "VI", 6,
            "VII", 7,
            "VIII", 8,
            "IX", 9,
            "X", 10);

    private final String[] arrayRomeNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVI", "XVII", "XVIII", "XIX", "XX"};
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
                .isEqualTo("Nulla");
    }
}
