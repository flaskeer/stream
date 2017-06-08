package com.asterisk.stream.kata;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * @author donghao
 * @version 1.0
 *          2017/6/8.
 */
public class SquareTest {

    @Test
    public void test_square() {
        int digits = new TestSquare().squareDigits2(9119);
        Assertions.assertThat(digits).isEqualTo(811181);
    }
}
