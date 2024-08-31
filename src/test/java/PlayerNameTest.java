import entities.PlayerName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerNameTest {
    public static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("abcdef"),
                Arguments.of("")
        );
    }

    @DisplayName("플레이어 이름의 길이가 1에서 5 사이가 아니라면 예외를 반환한다.")
    @ParameterizedTest
    @MethodSource("provideParameters")
    void playerNameLengthTest(String name) {
        assertThatThrownBy(() -> new PlayerName(name)).isInstanceOf(IllegalArgumentException.class);
    }
}
