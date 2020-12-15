package org.example.test;

import org.example.modal.Numbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test runner class
 */
public class TestRunner {

    Numbers numbers = new Numbers();

    /**
     * Test to calculate sum of numbers that are multiples of 3 & 5 below 10
     *
     * @throws Exception
     */
    @Test
    public void sumMul3nd5Bel10() throws Exception {
        int sum = numbers.sumOfNumsX3nd5(10);
        Assert.assertEquals(23, sum);
    }

    /**
     * Test to calculate sum of numbers that are multiples of 3 & 5 below 1000
     *
     * @throws Exception
     */
    @Test
    public void sumMul3nd5Bel1000() throws Exception {
        int sum = numbers.sumOfNumsX3nd5(1000);
        Assert.assertEquals(233168, sum);
    }

    /**
     * Test to throw exception for invalid number
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void invalidInput() throws Exception {
        int sum = numbers.sumOfNumsX3nd5(-10);
    }

}
