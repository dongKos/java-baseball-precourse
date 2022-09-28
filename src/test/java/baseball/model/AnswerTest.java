package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    private final int GAME_SIZE = 3;
    private final int RANDOM_RANGE_START = 1;
    private final int RANDOM_RANGE_END = 9;

    @Test
    @DisplayName("랜덤으로 생성된 3개의 번호는 중복되지 않는다")
    void test() {
        Answer answer = new Answer();
        answer.shuffle();

        Set<Integer> ballValues = new HashSet<>();
        for (Ball ball : answer.getBalls()) {
            ballValues.add(ball.getValue());
        }
        assertEquals(GAME_SIZE, ballValues.size());
    }

    @Test
    @DisplayName("랜덤으로 생성된 번호는 1-9사이의 번호여야 한다.")
    void test2() {
        Answer answer = new Answer();
        answer.shuffle();

        for (Ball ball : answer.getBalls()) {
            assertTrue(ball.getValue() <= RANDOM_RANGE_END && ball.getValue() >= RANDOM_RANGE_START);
        }
    }
}