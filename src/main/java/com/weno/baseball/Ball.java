package com.weno.baseball;

import java.util.Objects;

public class Ball {

    private int position;
    private int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public int getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }

    public BallStatus play(Ball userBall) {
        if (this.equals(userBall)){
            return BallStatus.STRIKE;
        }
        if (userBall.matchNumber(number)){
            return BallStatus.BAll;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchNumber(int number) {
        return this.number == number;
    }

}
