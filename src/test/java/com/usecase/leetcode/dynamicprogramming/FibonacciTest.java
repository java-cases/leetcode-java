package com.usecase.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void fib() {
        assertEquals(-1, Fibonacci.fib(-1));
        assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));

        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));
    }

    @Test
    void topDown() {
        long[] memo = new long[5 + 1];

        assertEquals(-1, Fibonacci.topDown(-1, memo));
        assertEquals(0, Fibonacci.topDown(0, memo));
        assertEquals(1, Fibonacci.topDown(1, memo));

        assertEquals(1, Fibonacci.topDown(2, memo));
        assertEquals(2, Fibonacci.topDown(3, memo));
        assertEquals(3, Fibonacci.topDown(4, memo));
        assertEquals(5, Fibonacci.topDown(5, memo));
    }

    @Test
    void bottomUp() {
        assertEquals(-1, Fibonacci.bottomUp(-1));
        assertEquals(0, Fibonacci.bottomUp(0));
        assertEquals(1, Fibonacci.bottomUp(1));

        assertEquals(1, Fibonacci.bottomUp(2));
        assertEquals(2, Fibonacci.bottomUp(3));
        assertEquals(3, Fibonacci.bottomUp(4));
        assertEquals(5, Fibonacci.bottomUp(5));
    }
}