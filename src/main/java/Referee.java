public class Referee {

    private Ball ball;

    public Referee(Ball ball) {
        this.ball = ball;
    }

    public Ball getBall() {
        return ball;
    }

    public String judge(Ball userBall) {
        if (ball.getPosition() == userBall.getPosition() && ball.getNumber() == ball.getNumber()){
            return "STRIKE";
        }
        return null;
    }
}
