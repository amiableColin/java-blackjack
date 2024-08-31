import entities.Card;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CardTest {
    @DisplayName("두 카드가 같은지를 확인하여, 같다면 true를 반환한다.")
    @Test
    void isSameCard() {
        // given
        Card cd1 = new Card("5", "스페이드");
        Card cd2 = new Card("5", "스페이드");
        // then
        assertThat(cd1.equals(cd2)).isEqualTo(true);
    }

    void getNumber() {
        // given
        Card c1 = new Card("J", "스페이드");
        final int EXPECTED_RESULT = 10;

        // when
        int result = c1.getNumber();

        // then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }
}
