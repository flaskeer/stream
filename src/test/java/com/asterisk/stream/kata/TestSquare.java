package com.asterisk.stream.kata;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.stream.Collectors;

/**
 * @author donghao
 * @version 1.0
 *          2017/6/5.
 */
public class TestSquare {

    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        if (n != 0) {
            String value = String.valueOf(n);
            for(int i = 0;i < value.length();i++) {
                int num = Integer.valueOf(value.substring(i,i+1));
                int square = num * num;
                result.append(String.valueOf(square));
            }
            return Integer.valueOf(result.toString());
        }  else {
            return 0;
        }

    }


    public int squareDigits1(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int digit = n % 10;
            result.insert(0, digit * digit);
            n /= 10;
        }
        return Integer.parseInt(result.toString());
    }

    public int squareDigits2(int n) {
        return Integer.parseInt(String.valueOf(n)
        .chars()
        .map(i -> Integer.parseInt(String.valueOf((char)i)))
        .map(i -> i * i)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining("")));
    }


    @Test
    public void test_square() {
        int digits = new TestSquare().squareDigits2(9119);
        Assertions.assertThat(digits).isEqualTo(811181);
    }



}
