package entities;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerList {
    private final Player[] players;

    public PlayerList(Player[] players) {
        this.players = players;
    }

    public Map<String, Integer> calculateProfit(int dealerNumber) {
        return Arrays.stream(players).collect(Collectors.toMap(Player::getName, p -> p.calculateProfit(dealerNumber)));
    }
}
