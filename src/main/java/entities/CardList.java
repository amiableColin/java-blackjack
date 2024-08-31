package entities;

import java.util.ArrayList;
import java.util.List;

public class CardList {
    private List<Card> cardList = new ArrayList<>();

    public CardList(List<Card> cardList) {
        for (Card card : cardList) {this.addCard(card);}
    }

    public void addCard(Card newCard) {
        if (this.isBurst()) {
            throw new IllegalStateException("[ERROR] Burst 상태에서는 카드를 받을 수 없습니다.");
        }
        if (cardList.contains(newCard)) {
            throw new IllegalArgumentException("[ERROR] 중복된 카드입니다.");
        }
        cardList.add(newCard);
    }

    public int totalNumber() {
        int aCount = (int) cardList.stream().filter(c -> c.getStringNumber().equals("A")).count();
        int result = cardList.stream().mapToInt(Card::getNumber).sum();
        if (result > 22) {
            result -= Math.min((result - 21) / 10, aCount) * 10;
        }
        return result <= 21 ? result : 0;
    }

    public boolean isBurst() {
        return !this.cardList.isEmpty() && this.totalNumber() == 0;
    }

    public boolean canGetOneMore() {
        return this.totalNumber() <= 16 && !this.isBurst();
    }
}
