package calculator.ui;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/*
Todo
1. input 값 검증
- [x] 문자열 끝에 공백에 있으면 삭제되어야 한다.
- [x] 공백의 갯수의 2배에 1을 더한값과 문자열의 길이는 같아야 한다.
- [x] 사칙연산 문자 1개 이상 존재
 */
public class CalculatorInputTest {

    CalculatorInput calculatorInput = new CalculatorInput();

    @Test
    void generateStr_메소드는_연산에_필요한_숫자와_문자를_입력받는다(){
        // 준비
        String input = "3 + 1 - 2 * 1";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());

        // 실행
        System.setIn(in);

        // 검증
        assertThat(input).isEqualTo("3 + 1 - 2 * 1");
    }

    @Test
    void getResult_메소드는_연산된_결과값을_받는다(){
        // 준비
        String input = "3 + 1 - 2 * 1";

        // 실행
        Double result = calculatorInput.getResult(input);

        // 검증
        assertThat(result).isEqualTo(2);
    }

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

    @Test
    void 문자열에_사칙연산과_관련된_문자가_없다면_예외가_발생한다(){
        // 준비
        String input = "3  1  2  1";

        // 실행
        boolean isValid = input.matches(".*[+\\-*/].*");

        // 검증
        assertThat(isValid).isFalse();
    }

}
