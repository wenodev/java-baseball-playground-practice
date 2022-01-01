package calculator.domain;

/**
 * 계산에 필요한 기능을 제공하는 클래스입니다.
 */
public class Calculator {

    /**
     * 입력받은 문자열을 계산하여 리턴합니다.
     * @param input 계산할 문자
     * @return 계산이 완료된 결과 값
     */
    public Double calculate(String input) {
        String[] array = makeArray(input);
        return makeResult(array);
    }

    /**
     * 입력받은 문자열을 배열로 리턴합니다.
     * @param input 문자열
     * @return 배열
     */
    public String[] makeArray(String input) {
        return input.split(" ");
    }

    /**
     * 입력받은 배열을 계산하여 결과 값을 리턴한다.
     * @param array 계산에 필요한 배열
     * @return 계산이 완료된 값
     */
    public Double makeResult(String[] array) {
        Double value = Double.valueOf(array[0]);
        for (int i=1; i<array.length; i++){
            if ("+".equals(array[i])){
                value += Double.valueOf(array[i+1]);
            }
            if ("-".equals(array[i])){
                value -= Double.valueOf(array[i+1]);
            }
            if ("*".equals(array[i])){
                value *= Double.valueOf(array[i+1]);
            }
            if ("/".equals(array[i])){
                value /= Double.valueOf(array[i+1]);
            }
        }
        return value;
    }
}
