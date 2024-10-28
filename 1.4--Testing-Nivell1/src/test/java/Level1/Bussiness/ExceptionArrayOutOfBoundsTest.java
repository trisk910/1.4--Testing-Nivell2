package Level1.Bussiness;

import Level1.Persistance.ExceptionArrayOutOfBounds;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionArrayOutOfBoundsTest {

    @Test
    void testThrowArrayIndexOutOfBoundsException() {
        ExceptionArrayOutOfBounds thrower = new ExceptionArrayOutOfBounds();
        assertThrows(ArrayIndexOutOfBoundsException.class, thrower::throwArrayIndexOutOfBoundsException);
    }
}