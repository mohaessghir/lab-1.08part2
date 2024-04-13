import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundToNearestCent(BigDecimal number) {
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        return roundedNumber.doubleValue();
    }

    public static BigDecimal invertSignAndRoundToNearestTenth(BigDecimal number) {
        BigDecimal invertedNumber = number.negate();
        BigDecimal roundedNumber = invertedNumber.setScale(1, RoundingMode.HALF_UP);
        return roundedNumber;
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("4.2545");
        BigDecimal number2 = new BigDecimal("-45.67");

        double rounded1 = roundToNearestCent(number1);
        BigDecimal rounded2 = invertSignAndRoundToNearestTenth(number2);

        System.out.println("Rounded to nearest cent: " + rounded1);
        System.out.println("Inverted sign and rounded to nearest tenth: " + rounded2);
    }
}