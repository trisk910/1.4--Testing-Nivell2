package Level1Junit.Bussiness;

import Level1Junit.Persistance.ExceptionArrayOutOfBounds;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionArrayOutOfBoundsTest {

    @Test
    void testThrowArrayIndexOutOfBoundsException() {
        ExceptionArrayOutOfBounds thrower = new ExceptionArrayOutOfBounds();
        assertThrows(ArrayIndexOutOfBoundsException.class, thrower::throwArrayIndexOutOfBoundsException);
    }
}