package Level2AssertJ.Ex5;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class KeyMapTest {

    @Test
    void testMapContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // Verify that the map contains a specific key
        assertThat(map).containsKey("key1");
    }
}