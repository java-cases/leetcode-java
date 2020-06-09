package com.usecase.leetcode.dynamicprogramming;

/**
 * 计算斐波那契数列（Fibonacci sequence）
 */
public final class Fibonacci {

    /**
     * 通过递归方式计算问题斐波那契数列（Fibonacci sequence）
     * 求解Fibonacci数列中第n个元素的值
     *
     * @param n 斐波那契数列中的位置
     * @return Fibonacci数列中第n个元素的值
     */
    public static int fib(int n) {
        if (n < 0) {
            return -1;
        }

        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    /**
     * 带备忘的自顶向下法（top-down with memoization）
     * 此方法仍按自然的递归形式编写过程，但过程会保存每个子问题的解（通常保存在一个数组或者散列表中）。
     * 当需要一个子问题的解时，过程首先检查是否已经保存过此解。如果是，则直接返回保存的值，从而节省了计算时间，否则，按通常的方式计算这个子问题。
     * 我们称这个递归过程是带备忘的（memoized）,因为它“记住”了之前计算出的结果。
     *
     * @param n
     * @return
     */
    public static long topDown(int n, long[] memo) {
        if (n < 0) {
            return -1;
        }

        if (n < 2) {
            return n;
        }

        if (memo[n] > 0) {
            return memo[n];
        } else {
            return memo[n] = topDown(n - 1, memo) + topDown(n - 2, memo);
        }
    }

    /**
     * 自底向上法（bottom-up method），这种方法一般需要恰当定义子问题的“规模”的概念，使得任何子问题的求解只依赖“更小的”子问题的求解。
     * 因而我们可以将子问题按规模排序，按由小到大的顺序进行求解。当求解某个子问题时，它所依赖的那些更小的子问题都已经求解完毕，结果已经保存。
     * 每个子问题只需求解依次，当我们求解它（也是第一次遇到它）时，它的所有前提子问题都已求解完成。
     *
     * @param n
     * @return
     */
    public static long bottomUp(int n) {
        if (n < 0) {
            return -1;
        }

        if (n < 2) {
            return n;
        }

        long[] memo = new long[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }
}
