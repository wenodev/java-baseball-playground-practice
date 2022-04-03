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

    public BallStatus play(Ball userBall) {
        Ball comBall = balls.get(userBall.getPosition() - 1);
        return comBall.play(userBall);
    }

    private List<Ball> mapBall(List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i< numbers.size(); i++){
            balls.add(new Ball(i, numbers.get(i)));
        }
        return balls;
    }

}
