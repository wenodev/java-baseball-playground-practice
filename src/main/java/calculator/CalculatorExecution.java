package calculator;

import calculator.domain.Calculator;
import calculator.ui.CalculatorInput;

public class CalculatorExecution {

    CalculatorInput calculatorInput = new CalculatorInput();
    Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorExecution calculatorExecution = new CalculatorExecution();
        calculatorExecution.start();
    }

    public void start() {
        String input = calculatorInput.generateStr();
        System.out.println("주어진 계산식: " + input);

        Double result = calculator.calculate(input);
        System.out.println("결과: " + result);
    }

}
