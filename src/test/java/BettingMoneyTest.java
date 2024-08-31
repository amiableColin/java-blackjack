import entities.BettingMoney;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BettingMoneyTest {
    @DisplayName("베팅금이 숫자가 아닐 때 예외를 반환한다.")
    @Test
    void NonNegativeInteger() {
        // given
        String result = "-20000";

        // then
        assertThatThrownBy(() -> BettingMoney.from(result)).isInstanceOf(IllegalArgumentException.class);
    }
}
