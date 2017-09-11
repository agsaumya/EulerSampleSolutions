package saumya.dev;

import java.math.BigInteger;

/**
 * @author Saumya
 */
public class Problem2 {

    /**
     * Problem 1000-digit Fibonacci number
       Problem 25 (https://projecteuler.net/problem=25)
     What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
     */

    public static void main(String[] args){
        long startTime = System.nanoTime();

        final int DIGITS=1000;

        // execute the code
        String out = find(DIGITS);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        //Printing the index in the string format
        System.out.println(out);


        System.out.println("Total Execution Time (miliseconds):" + (double)totalTime/1000000);
    }

    /**
     * Since the target number is relatively small, we will just keep on generating fibonacci numbers until we see one with exactly 1000 digits.
     * The big caveat here is that fibonacci numbers grow exponentially by about 1.61 times, so the the numbers in base 10 will get a new digit after every log10(1.61) ~= 4.7 steps.
     *  So that means our 1000the digit number will be somewhere around 4700 steps.
     * @param digits
     * @return
     */
    public static String find(int digits) {

    	if(digits <=0)
    		throw new RuntimeException("Value of Digits is either 0 or not valid!");
    	
        BigInteger rightMostThrees = BigInteger.TEN.pow(digits - 1);
        BigInteger leftMostThrees = BigInteger.TEN.pow(digits);
        BigInteger previousNum = BigInteger.ONE;
        BigInteger currentNum = BigInteger.ZERO;
        for (int i = 0; ; i++) {
            // At this point, previousNum = fibonacci(i - 1) and currentNum = fibonacci(i)
            if (currentNum.compareTo(leftMostThrees) >= 0)
                throw new RuntimeException("Number is not found!");
            else if (currentNum.compareTo(rightMostThrees) >= 0)
                return Integer.toString(i);

            // progress further in the fibonacci series
            BigInteger temp = currentNum.add(previousNum);
            previousNum = currentNum;
            currentNum = temp;
        }

    }

    }
