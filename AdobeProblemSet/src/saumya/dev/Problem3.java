package saumya.dev;

import java.math.BigInteger;

/**
 * @author Saumya
 */
public class Problem3 {

    /**
     * Problem 20 Factorial digit sum
		https://projecteuler.net/problem=47
     * n! means n × (n − 1) × ... × 3 × 2 × 1

		For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
		and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
		
		Find the sum of the digits in the number 100!
     */

    public static void main(String[] args){
        long startTime = System.nanoTime();

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        int number = 100;
        String out = find(number);

        System.out.println(out);

        System.out.println("Total Execution Time (nanoseconds):" + totalTime);
    }

    /**
     * We do a regular product with help from Java's BigInteger type.
     * @return
     */
    public static String find(int number) {
        String temp = factorial(number).toString(); // pass in to get a factorial
        int sum = 0;
        for (int i = 0; i < temp.length(); i++)
            sum += temp.charAt(i) - '0';
        return Integer.toString(sum);
    }


    // Returns Factorial of a big number
    public static BigInteger factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Invalid Input : Factorial of negative number");
        BigInteger prod = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            prod = prod.multiply(BigInteger.valueOf(i));
        return prod;
    }



}
