package com.weno.baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationUtil {

    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 9;
    private static final int STANDARD_SIZE = 3;

    public static boolean validateRange(int number) {
        if (checkLessThanMinAndMoreThanMax(number)){
            return false;
        }
        return true;
    }

    public static boolean validateDuplicateNumbers(List<Integer> integers) {
        if (compareSize(integers)){
            throw new IllegalArgumentException();
        }
        return true;
    }

    public static boolean validateSize(List<Integer> integers) {
        if (integers.size() != STANDARD_SIZE){
            throw new IllegalArgumentException();
        }
        return true;
    }

    private static boolean checkLessThanMinAndMoreThanMax(int number) {
        return number < MIN_NUM || number > MAX_NUM;
    }

    private static boolean compareSize(List<Integer> integers) {
        Set<Integer> integerSet = new HashSet<>(integers);
        return integers.size() != integerSet.size();
    }

}
