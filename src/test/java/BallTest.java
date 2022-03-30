import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void construct(){
        Ball ball = new Ball(1,1);

        assertThat(ball.getPosition()).isEqualTo(1);
        assertThat(ball.getNumber()).isEqualTo(1);
    }

}
