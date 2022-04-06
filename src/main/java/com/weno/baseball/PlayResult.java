package com.weno.baseball;

public class PlayResult {

    private int strike;
    private int ball;

    public PlayResult() {
        strike = 0;
        ball = 0;
    }

    public void report(BallStatus status) {
        if (status.equals(BallStatus.STRIKE)){
            strike++;
        }
        if (status.equals(BallStatus.BAll)){
            ball++;
        }

    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();

        if (strike == 0 && ball== 0){
            return "낫싱";
        }
        if (ball > 0){
            stringBuilder.append(ball).append("볼 ");
        }
        if (strike > 0){
            stringBuilder.append(strike).append("스트라이크");
        }
        return stringBuilder.toString();
    }
}
