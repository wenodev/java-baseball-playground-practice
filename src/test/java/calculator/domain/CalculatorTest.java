package calculator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void calculate_메소드는_주어진_문자열을_계산하여_리턴한다(){
        // 준비
        String input = "3 + 1 - 2 * 1";
        String[] array = calculator.makeArray(input);
        Double outcome = calculator.makeResult(array);

        // 실행
        Double result = calculator.calculate(input);

        // 검증
        assertThat(result).isEqualTo(2);
    }

    @Test
    void makeResult_메소드는_주어진_배열을_계산하여_리턴한다(){
        // 준비
        String[] array = {"4", "*", "4", "-", "2", "/", "2"};

        // 실행
        Double result = calculator.makeResult(array);

        // 검증
        assertThat(result).isEqualTo(7);
    }

}