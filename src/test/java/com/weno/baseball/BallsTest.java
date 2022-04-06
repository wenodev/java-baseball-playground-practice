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
    void play_123_3Strike(){
        PlayResult playResult = balls.play(Arrays.asList(1,2,3));

        assertThat(playResult.getStrike()).isEqualTo(3);
        assertThat(playResult.getBall()).isEqualTo(0);
        assertThat(playResult.print()).isEqualTo("3스트라이크");
    }

    @Test
    void play_213_3Strike_2ball1strike(){
        PlayResult playResult = balls.play(Arrays.asList(2,1,3));

        assertThat(playResult.getStrike()).isEqualTo(1);
        assertThat(playResult.getBall()).isEqualTo(2);
        assertThat(playResult.print()).isEqualTo("2볼 1스트라이크");
    }

    @Test
    void play_456_nothing(){
        PlayResult playResult = balls.play(Arrays.asList(4,5,6));

        assertThat(playResult.getStrike()).isEqualTo(0);
        assertThat(playResult.getBall()).isEqualTo(0);
        assertThat(playResult.print()).isEqualTo("낫싱");
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
