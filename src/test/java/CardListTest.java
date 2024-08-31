import entities.Card;
import entities.CardList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CardListTest {
    @DisplayName("Burst일 때 A는 1로 취급하여 계산한다.")
    @Test
    void totalNumber() {
        // given
        CardList cardList = new CardList(List.of(new Card("10", "스페이드"), new Card("A", "스페이드"), new Card("J", "스페이드")));
        int EXPECTED_RESULT = 21;
        // when
        int result = cardList.totalNumber();
        // then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }
}
