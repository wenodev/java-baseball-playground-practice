package com.weno.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball comBall;
    private final static int COM_POSITION = 1;
    private final static int COM_NUMBER = 1;

    @BeforeEach
    void setUp() {
        comBall = new Ball(COM_POSITION, COM_NUMBER);
    }

    @Test
    void construct() {
        assertThat(comBall.getPosition()).isEqualTo(COM_POSITION);
        assertThat(comBall.getNumber()).isEqualTo(COM_NUMBER);
    }

    @Test
    void play_samePositionAndNumber_strike() {
        Ball userBall = new Ball(1,1);
        assertThat(comBall.play(userBall)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void play_notSamePositionAndSameNumber_ball() {
        Ball userBall = new Ball(2,1);
        assertThat(comBall.play(userBall)).isEqualTo(BallStatus.BAll);
    }

    @Test
    void play_notSamePositionAndNumber_nothing() {
        Ball userBall = new Ball(1,4);
        assertThat(comBall.play(userBall)).isEqualTo(BallStatus.NOTHING);
    }

}
