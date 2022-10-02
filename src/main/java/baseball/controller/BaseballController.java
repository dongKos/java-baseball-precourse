package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.view.GameView;

import static baseball.constant.BaseballProperties.GAME_SIZE;

public class BaseballController {
    private final GameView gameView = new GameView();
    private User user;
    private Computer computer;

    public void start() {
        init();
        play();
    }

    private void play() {
        while (!user.isCorrect()) {
            guess();
        }
        askRestart();
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

    private void askRestart() {
        System.out.println(GAME_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면1, 종료하려면 2를 입력하세요.");
        String restart = gameView.getInputNumber();

        if(restart.equals("1")) {
            start();
        }

        System.exit(0);
    }
}
