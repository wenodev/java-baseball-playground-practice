public class Referee {

    private Ball ball;

    public Referee(Ball ball) {
        this.ball = ball;
    }

    public Ball getBall() {
        return ball;
    }

    public BallStatus judge(Ball userBall) {
        if (ball.getPosition() == userBall.getPosition() && ball.getNumber() == ball.getNumber()){
            return BallStatus.STRIKE;
        }
        return BallStatus.NOTHING;
    }
}
