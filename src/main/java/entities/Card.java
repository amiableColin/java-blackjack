package entities;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Card {
    static Map<String, Integer> numbers = Map.ofEntries(Map.entry("A", 11), Map.entry("2", 2), Map.entry("3", 3),
            Map.entry("4", 4), Map.entry("5", 5), Map.entry("6", 6), Map.entry("7", 7), Map.entry("8", 8),
            Map.entry("9", 9), Map.entry("10", 10), Map.entry("J", 10), Map.entry("Q", 10), Map.entry("K", 10)
    );
    static String[] shapes = {"클로버", "스페이드", "다이아몬드", "하트"};

    private String[] stringNubmers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    private String stringNumber;
    private final String shape;

    public Card(String stringNumber, String shape) {
        this.stringNumber = stringNumber;
        this.shape = shape;
    }

    public Card() {
        this.stringNumber = this.stringNubmers[new Random().nextInt(0, 12)];
        this.shape = shapes[new Random().nextInt(0, 3)];
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card another)) {
            return false;
        }
        return another.getStringNumber().equals(this.stringNumber) && another.getShape().equals(this.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.stringNumber, this.shape);
    }

    public String getStringNumber() {return stringNumber;}
    public String getShape() {return shape;}

    public int getNumber() {
        return numbers.get(this.stringNumber);
    }
}
