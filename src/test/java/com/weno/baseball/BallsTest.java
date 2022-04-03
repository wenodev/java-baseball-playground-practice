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
        balls.play(new Ball(1,4));
    }

    @Test
    void play_notSamePositionAndSameNumber_nothing(){
        balls.play(new Ball(1,2));
    }

    @Test
    void play_SamePositionAndNumber_nothing(){
        balls.play(new Ball(1,1));
    }

}
