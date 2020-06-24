package com.company;

import java.util.HashSet;

public class SetClass {
    HashSet<Integer> cards = new HashSet<>();
    int numberCards;

    public SetClass(int numberCards) {
        this.numberCards = numberCards;
    }

    public void addCards() {
        cards.add(numberCards);
        System.out.println(cards);
    }
}
