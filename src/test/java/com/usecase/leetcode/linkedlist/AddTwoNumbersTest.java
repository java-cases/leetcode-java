package com.usecase.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        ListNode node1 = new ListNode(2).next(4).next(3).root;
        ListNode node2 = new ListNode(5).next(6).next(4).root;

        ListNode node = AddTwoNumbers.run(node1, node2);
        System.out.println(node);

        assertEquals(7, node.val);
        assertEquals(0, node.next.val);
        assertEquals(8, node.next.next.val);
    }
}