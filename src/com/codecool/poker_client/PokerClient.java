package com.codecool.poker_client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerClient {

    private List<Card> ownCards = new ArrayList<>();

    public PokerClient(String code1, String code2, String code3, String code4, String code5) {
        ownCards.addAll(Arrays.asList(new Card(code1), new Card(code2), new Card(code3), new Card(code4), new Card(code5)));
    }

    public boolean highestCardIsMine(String code1, String code2, String code3, String code4, String code5) {
        List<Card> cards = new ArrayList<>(Arrays.asList(new Card(code1), new Card(code2), new Card(code3), new Card(code4), new Card(code5)));
        cards.addAll(ownCards);

        Card highestCard = cards.get(0);
        Card currentCard;
        for (int i = 1; i < cards.size(); i++) {
            currentCard = cards.get(i);
            if (currentCard.getValue() > highestCard.getValue()) {
                highestCard = currentCard;
            }
        }

        return ownCards.contains(highestCard);
    }

}