import java.util.*;

public class Card {

    String cardCode;

    private final static Map<String, Integer> cardValues = new HashMap<>() {{
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
        put("10", 10);
        put("J", 11);
        put("Q", 12);
        put("K", 13);
        put("A", 14);
    }};

    private final static List<String> cardColors = new ArrayList<>(Arrays.asList("S", "C", "D", "H"));

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;

        String cardColor = this.cardCode.substring(0, 1).toUpperCase();
        if (!cardColors.contains(cardColor)) {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }

        String cardValue = cardCode.substring(1).toUpperCase();
        if (cardValues.get(cardValue) == null) {
            throw new IllegalArgumentException("card number isn't valid: " + cardValue);
        }
    }

    public int getValue() {
        return cardValues.get(cardCode.substring(1).toUpperCase());
    }
}
