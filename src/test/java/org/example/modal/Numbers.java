package org.example.modal;

/**
 * Numbers class to sum the numbers that are multiples of 3 & 5
 */
public class Numbers {

    /**
     * Method to calculate sum of numbers that are multiples of 3 & 5
     *
     * @param maxNum - Integer, Upper index
     * @return - Integer, Sum of numbers that are multiples of 3 & 5
     * @throws Exception for invalid numbers
     */
    public int sumOfNumsX3nd5(int maxNum) throws Exception {
        if (maxNum < 1 || maxNum > 1000) {
            throw new Exception("Invalid Number " + maxNum + ", Please input number between 1 tp 1000");
        }
        int sum = 0;
        for (int i = 1; i < maxNum; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum = sum + i;
        }
        return sum;
    }
}
