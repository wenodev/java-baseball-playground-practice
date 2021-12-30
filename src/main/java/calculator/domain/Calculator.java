package calculator.domain;

public class Calculator {
    public Double calculate(String input) {
        String[] array = makeArray(input);
        return 2D;
    }

    public String[] makeArray(String input) {
        return input.split(" ");
    }

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
