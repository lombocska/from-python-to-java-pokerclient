import java.util.Arrays;
import java.util.List;

/**
 * Created by mbeothy on 2016. 12. 08..
 */
public class Card {

    String cardCode;
    private String cardColor;
    private String cardValue;
    private static final List color = Arrays.asList("S", "C", "D", "H");
    private static final List value = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");

    // constructor
    public Card(String cardCode) throws IllegalArgumentException {

        this.cardColor = cardCode.substring(0, 1).toUpperCase();
        this.cardValue = cardCode.substring(1).toUpperCase();

        // raises exception if cardValue is a letter, but not J/Q/K/A
        if (!(color.contains(cardColor))) {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }
        if (!(value.contains(cardValue))) {
            throw new IllegalArgumentException("card number isn't valid: " + cardValue);
        }

        this.cardCode = cardCode.toUpperCase();

    }

    public int getValue() {
        return value.indexOf(cardValue) +2;
    }
}
