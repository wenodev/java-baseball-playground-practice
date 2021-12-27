package calculator.ui;

import java.util.Scanner;

public class CalculatorInput {

    private String input;

    public String getInput() {
        return input;
    }

    public String generateStr() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        return input;
    }

    public Double getResult() {
        return null;
    }
}
