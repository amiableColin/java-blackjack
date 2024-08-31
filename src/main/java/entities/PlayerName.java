package entities;

public class PlayerName {
    private String name;

    public PlayerName(String name) {
        this.name = name;
        validateNameLength();
    }

    private void validateNameLength() {
        boolean isAcceptLength = 0 < this.name.length() && this.name.length() <= 5;
        if (!isAcceptLength) {
            throw new IllegalArgumentException("[ERROR] 적절하지 않은 이름 길이입니다.");
        }
    }

}
