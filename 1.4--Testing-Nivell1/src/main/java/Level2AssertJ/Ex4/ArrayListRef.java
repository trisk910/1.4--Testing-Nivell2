package Level2AssertJ.Ex4;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListRef {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Object1 obj1 = new Object1("Object1");
        Object2 obj2 = new Object2("Object2");
        Object3 obj3 = new Object3("Object3");
        Object4 obj4 = new Object4("Object4");

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        assertThat(list).containsExactly(obj1, obj2, obj3);//En ordre
        assertThat(list).containsExactlyInAnyOrder(obj3, obj1, obj2);
        assertThat(list).containsOnlyOnce(obj1);
        assertThat(list).doesNotContain(obj4);
    }
}
