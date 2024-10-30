package Level2AssertJ.Ex1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class IntAssertionTest {

    @Test
    void testIntegerAssertions() {
        int value1 = 1;
        int value2 = 1;
        int value3 = 2;

        assertThat(value1).isEqualTo(value2);
        assertThat(value1).isNotEqualTo(value3);
    }
}
