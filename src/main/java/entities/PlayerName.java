package entities;

public class PlayerName {
    private String name;

    public PlayerName(String name) {
        this.name = name;
        validateNameLength();
        validateBlank();
    }

    private void validateNameLength() {
        boolean isAcceptLength = 0 < this.name.length() && this.name.length() <= 5;
        if (!isAcceptLength) {
            throw new IllegalArgumentException("[ERROR] 적절하지 않은 이름 길이입니다.");
        }
    }

    private void validateBlank() {
        boolean isBlank = this.name.strip().contains(" ") || this.name.isBlank();
        if (isBlank) {
            throw new IllegalArgumentException("[ERROR] 플레이어 이름은 공백을 허용하지 않습니다.");
        }
    }

    public String get() {
        return this.name;
    }
}
