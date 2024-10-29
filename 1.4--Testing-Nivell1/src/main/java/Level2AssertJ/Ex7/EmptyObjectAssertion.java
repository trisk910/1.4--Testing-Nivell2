package Level2AssertJ.Ex7;

import org.assertj.core.api.Assertions;

import java.util.Optional;

public class EmptyObjectAssertion {
    public static void main(String[] args) {
        Optional<Object> emptyOptional = Optional.empty();
        Assertions.assertThat(emptyOptional).isEmpty();
    }
}
