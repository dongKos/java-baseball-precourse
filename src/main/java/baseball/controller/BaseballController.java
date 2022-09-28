package baseball.controller;

import baseball.model.Answer;
import baseball.view.GameView;

public class BaseballController {
    private final GameView gameView = new GameView();
    private Answer answer;

    public void start() {
        answer = new Answer();
        answer.shuffle();
        gameView.start();
        System.out.println(answer);
    }
}
