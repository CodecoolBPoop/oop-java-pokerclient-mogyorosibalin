import java.util.HashMap;

public class Card {

    String cardCode;

    private static final HashMap<String, Integer> alphabeticCardValue = new HashMap<>() {{
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
        put("10", 10);
        put("j", 11);
        put("q", 12);
        put("k", 13);
        put("a", 14);
    }};

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;

        String cardColor = this.cardCode.substring(0, 1).toUpperCase();

        if (!cardColor.contentEquals("S") &&
            !cardColor.contentEquals("C") &&
            !cardColor.contentEquals("D") &&
            !cardColor.contentEquals("H"))
        {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }

        String cardValue = cardCode.substring(1).toUpperCase();
        Integer intCardValue;

        if (alphabeticCardValue.get(cardCode.substring(1).toUpperCase()) == null) {
            // raises exception if cardValue is a letter, but not J/Q/K/A
            intCardValue = Integer.parseInt(cardValue);
            if (intCardValue > 10) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }
            if (intCardValue < 2) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }

        }
    }

    public int getValue() {
        String cardValue = cardCode.substring(1).toUpperCase();
        Integer intCardValue;

        if (alphabeticCardValue.get(cardCode.substring(1).toUpperCase()) == null) {
            intCardValue = Integer.parseInt(cardValue);
        } else {
            intCardValue = alphabeticCardValue.get(cardCode.substring(1).toUpperCase());
        }

        return intCardValue;
    }
}
