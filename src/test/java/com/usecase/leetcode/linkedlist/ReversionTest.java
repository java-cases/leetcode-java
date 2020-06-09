package com.usecase.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReversionTest {

    @Test
    void reverseList() {
        ListNode node = new ListNode(1).next(2).next(3).root;
        ListNode reversedNode = Reversion.reverseList(node);
        System.out.println(reversedNode);

        assertNode(reversedNode);
    }

    private void assertNode(ListNode reversedNode) {
        assertEquals(3, reversedNode.val);
        assertEquals(2, reversedNode.next.val);
        assertEquals(1, reversedNode.next.next.val);

        assertNull(reversedNode.next.next.next);
    }

    @Test
    void reverseList2() {
        ListNode node = new ListNode(1).next(2).next(3).root;
        ListNode reversedNode = Reversion.reverseList2(node);
        System.out.println(reversedNode);

        assertNode(reversedNode);
    }

    @Test
    void reverseList3() {
        ListNode node = new ListNode(1).next(2).next(3).root;
        ListNode reversedNode = Reversion.reverseList3(node);
        System.out.println(reversedNode);

        assertNode(reversedNode);
    }

    @Test
    void reverseBetween() {
        ListNode node = new ListNode(1).next(2).next(3).next(4).next(5).root;
        ListNode reversedNode = Reversion.reverseBetween(node, 2, 4);
        System.out.println(reversedNode);

        assertEquals(1, reversedNode.val);
        assertEquals(4, reversedNode.next.val);
        assertEquals(3, reversedNode.next.next.val);
        assertEquals(2, reversedNode.next.next.next.val);
        assertEquals(5, reversedNode.next.next.next.next.val);

        assertNull(reversedNode.next.next.next.next.next);
    }
}