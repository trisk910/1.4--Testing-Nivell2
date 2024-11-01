package Level2AssertJ.Ex6;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ExceptionArrayTest {

    @Test
    void testProvokeException() {
        ExceptionArray exceptionArray = new ExceptionArray();
        assertThatThrownBy(exceptionArray::provokeException)
            .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}