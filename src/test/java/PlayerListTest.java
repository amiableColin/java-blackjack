import entities.Card;
import entities.CardList;
import entities.Player;
import entities.PlayerList;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class PlayerListTest {

    @DisplayName("딜러의 총 합을 인자로 받았을 때, 수익금액을 반환한다.")
    @Test
    void calculateProfit() {
        PlayerList playerList = new PlayerList(new Player[]{new Player("길동", "20000", new CardList(List.of(new Card("5", "스페이드"), new Card("10", "스페이드")))),
                new Player("준성", "30000", new CardList(List.of(new Card("8", "스페이드"), new Card("9", "스페이드"))))});

        Map<String, Integer> result = playerList.calculateProfit(16);

        assertThat(result).isEqualTo(Map.of("준성", 30000, "길동", -20000));
    }
}
