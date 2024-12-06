package org.howard.edu.lsp.finalexam.question1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
	private final MathUtils mathUtils = new MathUtils();

    // Tests for factorial
    @Test
    public void factorial_nonNegativeNumber_returnsCorrectResult() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    public void factorial_smallNonNegativeNumber_returnsOne() {
        assertEquals(1, mathUtils.factorial(0));
        assertEquals(1, mathUtils.factorial(1));
    }

    @Test
    public void factorial_negativeNumber_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    // Tests for isPrime
    @Test
    public void isPrime_primeNumber_returnsTrue() {
        assertTrue(mathUtils.isPrime(7));
        assertTrue(mathUtils.isPrime(13));
    }

    @Test
    public void isPrime_nonPrimeNumber_returnsFalse() {
        assertFalse(mathUtils.isPrime(4));
        assertFalse(mathUtils.isPrime(9));
    }

    @Test
    public void isPrime_edgeCases_returnsCorrectResult() {
        assertFalse(mathUtils.isPrime(0));
        assertFalse(mathUtils.isPrime(1));
        assertTrue(mathUtils.isPrime(2));
    }

    // Tests for gcd
    @Test
    public void gcd_twoNonZeroNumbers_returnsCorrectGCD() {
        assertEquals(6, mathUtils.gcd(54, 24));
    }

    @Test
    public void gcd_oneNumberIsZero_returnsAbsoluteOtherNumber() {
        assertEquals(25, mathUtils.gcd(25, 0));
        assertEquals(10, mathUtils.gcd(0, 10));
    }

    @Test
    public void gcd_bothNumbersZero_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}

