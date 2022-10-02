package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.view.GameView;

public class BaseballController {
    private final GameView gameView = new GameView();
    private User user;
    private Computer computer;

    public void start() {
        init();
        play();
    }

    private void play() {
        guess();
    }

    private void init() {
        user = new User();
        computer = new Computer();
        computer.shuffle();
        System.out.println(computer);
    }

    private void guess() {
        System.out.print("숫자를 입력해주세요: ");
        String inputNumber = gameView.getInputNumber();

        System.out.println(user.guessAndGetResult(inputNumber, computer.getAnswer()));
    }
}
