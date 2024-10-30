package Level2AssertJ.Ex7;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

public class EmptyObjectAssertionTest {

    @Test
    void testEmptyOptional() {
        Optional<Object> emptyOptional = Optional.empty();
        assertThat(emptyOptional).isEmpty();
    }
}