package entities;

public class BettingMoney {
    private int bettingMoney;

    public BettingMoney(int bettingMoney) {
        this.bettingMoney = bettingMoney;
    }

    public static BettingMoney from(String bettingmoney) {
        validateNonNegativeInteger(bettingmoney);
        return new BettingMoney(Integer.parseInt(bettingmoney));
    }

    private static void validateNonNegativeInteger(String bettingmoney) {
        boolean isInteger = bettingmoney.chars().allMatch(c -> 0 <= c - '0' && c - '0' <= 9);
        if (!isInteger) {
            throw new IllegalArgumentException("[ERROR] 베팅금은 0 이상의 정수여야 합니다.");
        }
    }

    public int getBettingMoney() {return bettingMoney;}
}
