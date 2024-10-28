package Level1.Bussiness;

public class DNICalculator {
    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateLetter(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99999999");
        }
        int index = dniNumber % LETTERS.length();
        return LETTERS.charAt(index);
    }
}