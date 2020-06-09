package com.usecase.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveElementsTest {

    @Test
    void removeElements() {
        ListNode node = new ListNode(1).next(2).next(2).next(3).root;
        RemoveElements.removeElements(node, 2);

        System.out.println(node);

        assertEquals(1, node.val);
        assertEquals(3, node.next.val);

        assertNull(node.next.next);
    }
}