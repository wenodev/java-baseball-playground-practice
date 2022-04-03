package com.weno.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1,2,3));
    }

    @Test
    void construct() {
        assertThat(balls.getBalls().size()).isEqualTo(3);
    }

    @Test
    void play_notSamePositionAndNumber_nothing(){
        assertThat(balls.play(new Ball(1,4))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void play_notSamePositionAndSameNumber_ball(){
        assertThat(balls.play(new Ball(1,2))).isEqualTo(BallStatus.BAll);
    }

    @Test
    void play_SamePositionAndNumber_strike(){
        assertThat(balls.play(new Ball(1,1))).isEqualTo(BallStatus.STRIKE);
    }

}
