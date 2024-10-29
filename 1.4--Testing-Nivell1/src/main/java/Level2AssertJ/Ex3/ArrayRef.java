package Level2AssertJ.Ex3;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayRef {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = array1;
        int[] array3 = new int[5];

        assertThat(array1).isSameAs(array2);
        assertThat(array1).isNotSameAs(array3);
    }
}
