package Level1Junit.Bussiness;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNICalculatorTest {
    private DNICalculator dniCalculator;

    @DisplayName("Creates a new DNICalculator")
    @BeforeEach
    public void setUp() {
        dniCalculator = new DNICalculator();
    }

    @Test
    void testCalculateLetter() {
        assertEquals('E', dniCalculator.calculateLetter(45785708));
        assertEquals('Z', dniCalculator.calculateLetter(12345678));
        assertEquals('X', dniCalculator.calculateLetter(87654321));
        assertEquals('D', dniCalculator.calculateLetter(87633321));
        assertEquals('H', dniCalculator.calculateLetter(11111111));
        assertEquals('J', dniCalculator.calculateLetter(22222222));
        assertEquals('P', dniCalculator.calculateLetter(33333333));
        assertEquals('A', dniCalculator.calculateLetter(44444444));
        assertEquals('K', dniCalculator.calculateLetter(55555555));
        assertEquals('Y', dniCalculator.calculateLetter(88888888));
    }

}
