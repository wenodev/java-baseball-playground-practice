import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {
    @Test
    void construct(){
        Ball comBall = new Ball(1, 1);
        Referee referee = new Referee(comBall);

        assertThat(referee.getBall().getPosition()).isEqualTo(1);
        assertThat(referee.getBall().getNumber()).isEqualTo(1);
    }

    @Test
    void judge_samePositionSameNumber_strike(){
        Ball comBall = new Ball(1, 1);
        Ball userBall = new Ball(1,1);
        Referee referee = new Referee(comBall);

        assertThat(referee.judge(userBall)).isEqualTo("STRIKE");
    }

}