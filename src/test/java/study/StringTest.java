package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void test_1(){
        // 준비
        String actual = "1,2";

        // 실행
        String[] arr = actual.split(",");

        // 검증
        assertThat(arr).contains("1"); // 순서를 보장한다.
        assertThat(arr).containsExactly("1"); // 순서를 보장하지 않는다.
    }

    @Test
    void test_2(){
        // 준비
        String givenStr = "(1,2)";

        // 실행
        String result = givenStr.substring(1,4);

        // 검증
        assertThat(result).isEqualTo("1,2");
    }
}
