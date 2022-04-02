package com.weno.baseball;

import com.weno.baseball.ValidationUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidationUtilTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9})
    void validateRange_BetweenOneAndNine_true(int number){
        boolean result = ValidationUtil.validateRange(number);
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void validateRange_lessThanOneAndMoreThanNine_false(int number){
        boolean result = ValidationUtil.validateRange(number);
        assertThat(result).isFalse();
    }

    @Test
    void validateDuplicateNumbers_2duplicateNumber_throwException(){
        assertThatThrownBy(() -> {
            ValidationUtil.validateDuplicateNumbers(List.of(1,1,3));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validateDuplicateNumbers_noDuplicateNumber_throwException(){
        boolean result = ValidationUtil.validateDuplicateNumbers(List.of(1,2,3));
        assertThat(result).isTrue();
    }

    @Test
    void validateSize_standard_throwException(){
        boolean result = ValidationUtil.validateSize(List.of(1,2,3));
        assertThat(result).isTrue();
    }

    @Test
    void validateSize_not_standard_throwException(){
        assertThatThrownBy(() -> {
            ValidationUtil.validateSize(List.of(1,2));
        }).isInstanceOf(IllegalArgumentException.class);
    }

}
