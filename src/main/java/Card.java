import java.util.HashMap;

/**
 * Created by mbeothy on 2016. 12. 08..
 */
public class Card {

    String cardCode;
    String cardColor;
    String cardValue;
    Integer intCardValue;

    HashMap<String, Integer> alphabeticCardValue = new HashMap<>();

    // constructor
    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;
        cardColor = this.cardCode.substring(0, 1).toUpperCase();
        cardValue = cardCode.substring(1).toUpperCase();

        if (!cardColor.contentEquals("S") &&
            !cardColor.contentEquals("C") &&
            !cardColor.contentEquals("D") &&
            !cardColor.contentEquals("H"))
        {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }

        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        if (alphabeticCardValue.get(cardValue) == null) {
            // raises exception if cardValue is a letter, but not J/Q/K/A
            intCardValue = Integer.parseInt(cardValue);
            if (intCardValue > 10) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }
            if (intCardValue < 2) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }

        } else {
            intCardValue = alphabeticCardValue.get(cardValue);
        }
    }

    public int getValue() {
        return intCardValue;
    }
}
