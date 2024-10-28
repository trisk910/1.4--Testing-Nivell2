package Level1.Persistance;

public class ExceptionArrayOutOfBounds {
    public void throwArrayIndexOutOfBoundsException() {
        int[] array = new int[5];
        // This will throw an ArrayIndexOutOfBoundsException
        int value = array[10];
    }
}