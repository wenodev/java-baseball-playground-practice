package calculator.ui;

import java.util.Scanner;

/**
 * 계산을 위한 문자열을 입력받는 클래스입니다.
 */
public class CalculatorInput {

    /**
     * Scanner로 입력받은 문자를 리턴합니다
     * @return 입력받은 문자
     */
    public String generateStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
