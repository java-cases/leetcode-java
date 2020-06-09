package com.usecase.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DuplicatesTest {

    @Test
    void deleteDuplicates() {
        ListNode node = new ListNode(1).next(2).next(2).next(3).root;
        Duplicates.deleteDuplicates(node);

        System.out.println(node);

        assertEquals(1, node.val);
        assertEquals(2, node.next.val);
        assertEquals(3, node.next.next.val);

        assertNull(node.next.next.next);
    }
}