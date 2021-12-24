package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
Todo
1. input 값 검증
- [x] 문자열 끝에 공백에 있으면 삭제되어야 한다.
- [ ] 공백은 문자열 길이 - 2가 되어야한다.
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

}
