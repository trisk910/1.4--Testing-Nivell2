package Level2AssertJ.Ex1;

import static org.assertj.core.api.Assertions.assertThat;

public class IntAssertion {
    public static void main(String[] args) {
        Integer value1 = 1;
        Integer value2 = 1;
        Integer value3 = 2;

        assertThat(value1).isEqualTo(value2);
        assertThat(value1).isNotEqualTo(value3);
    }

}
