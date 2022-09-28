package baseball.model;


import baseball.util.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.constant.BaseballProperties.GAME_SIZE;

public class Answer {
    private List<Ball> balls = new ArrayList<> ();

    public List<Ball> getBalls() {
        return this.balls;
    }

    public Answer() {
        for (int i = 0; i < GAME_SIZE; i++) {
            balls.add(new Ball());
        }
    }

    public void shuffle() {
        List<Integer> randomNumberList = new ArrayList<>(getUniqueIntegers());
        for (int i = 0; i < GAME_SIZE; i++) {
            balls.get(i).initializeBall(randomNumberList.get(i));
        }
    }

    private Set<Integer> getUniqueIntegers() {
        Set<Integer> randomNumberSet = new HashSet<>();
        while (randomNumberSet.size() < GAME_SIZE) {
            randomNumberSet.add(RandomNumberGenerator.getRandomNumber());
        }
        return randomNumberSet;
    }
}
