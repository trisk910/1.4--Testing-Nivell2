package Level2AssertJ.Ex2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ObjectRefTest {

    @Test
    void testObjectReferences() {
        Object object1 = new Object();
        Object object2 = object1;
        Object object3 = new Object();

        assertThat(object1).isSameAs(object2);
        assertThat(object1).isNotSameAs(object3);
    }
}
