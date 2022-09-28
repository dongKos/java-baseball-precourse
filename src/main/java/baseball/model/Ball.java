package baseball.model;

public class Ball {
    private int value;
    private BaseballStatus status;

    public Ball() {
        this.status = BaseballStatus.NOTHING;
    }

    public int getValue() {
        return this.value;
    }

    public void initializeBall(int value) {
        this.value = value;
        this.status = BaseballStatus.NOTHING;
    }
}
