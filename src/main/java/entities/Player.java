package entities;

public class Player {
    private PlayerName name;
    private BettingMoney bettingMoney;
    private CardList cardList;

    public Player(String name, String bettingMoney, CardList cardList) {
        this.name = new PlayerName(name);
        this.bettingMoney = BettingMoney.from(bettingMoney);
        this.cardList = cardList;
    }

    public String getName() {return name.get();}

    public BettingMoney getBettingMoney() {return bettingMoney;}

    public CardList getCardList() {return cardList;}


    public int calculateProfit(int anotherNumber) {
        if (anotherNumber < this.cardList.totalNumber()) {
            return bettingMoney.getBettingMoney();
        }
        return anotherNumber > this.cardList.totalNumber() ? -bettingMoney.getBettingMoney() : 0;
    }
}
