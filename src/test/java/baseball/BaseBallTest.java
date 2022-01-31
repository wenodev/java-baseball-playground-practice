package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallTest {

    private BaseBall baseBall;

    @BeforeEach
    void setUp(){
        baseBall = new BaseBall();
    }

    @Test
    void test_generate_random_number(){
        // 준비

        // 실행
        int number = baseBall.generateRandomNumber();

        // 검증
        assertThat(number).isGreaterThan(100);
        assertThat(number).isLessThan(1000);
    }

    @Test
    void test_submit_answer(){
        // 준비

        // 실행
        String expected = baseBall.submitAnswer();

        // 검증
    }

}
