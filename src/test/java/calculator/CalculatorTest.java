package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/*
Todo
1. input 값 검증
- [x] 문자열 끝에 공백에 있으면 삭제되어야 한다.
- [x] 공백의 갯수의 2배에 1을 더한값과 문자열의 길이는 같아야 한다.
- [ ] 사칙연산 문자 1개 이상 존재
- [ ] 숫자 문자 2개 이상 존재
- [ ] 숫자, 사칙연산을 제외한 문자 입력하면 안됨
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void 문자열_끝에_공백이있다면_제거하라(){
        // 준비
        String input = "3 + 1 - 2 * 1 ";
        String expression = input.trim();

        // 실행
        expression.trim();

        // 검증
        assertThat(input.length()).isEqualTo(expression.length()+1);
    }

    @Test
    void 문자열의_길이는_공백문자갯수에_두배에_1을_더한값과_같아야한다(){
        // 준비
        String input = "3 + 1 - 2 * 1";
        int whileSpaceNumber = (int) input.chars().filter(c -> c == ' ').count();

        // 실행

        // 검증
        assertThat(input.length()).isEqualTo(whileSpaceNumber*2+1);
    }

}
