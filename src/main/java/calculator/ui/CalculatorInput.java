package calculator.ui;

import calculator.Calculator;

import java.util.Scanner;

public class CalculatorInput {

    private final Calculator calculator;

    private String input;

    public CalculatorInput(Calculator calculator) {
        this.calculator = calculator;
    }

    public String getInput() {
        return input;
    }

    public String generateStr() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        return input;
    }

    public Double getResult() {
        return calculator.getResult(input);
    }
}
