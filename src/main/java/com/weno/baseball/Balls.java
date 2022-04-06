package com.weno.baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> balls;

    public Balls(List<Integer> numbers) {
        balls = mapBall(numbers);
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public PlayResult play(List<Integer> numbers){
        PlayResult playResult = new PlayResult();
        List<Ball> userBalls = mapBall(numbers);
        for (Ball ball : userBalls){
            playResult.report(play(ball));
        }
        return playResult;
    }


    public BallStatus play(Ball userBall) {
        return balls.stream()
                .map(comBall -> comBall.play(userBall))
                .filter(status -> status != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    private List<Ball> mapBall(List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i< numbers.size(); i++){
            balls.add(new Ball(i+1, numbers.get(i)));
        }
        return balls;
    }

}
