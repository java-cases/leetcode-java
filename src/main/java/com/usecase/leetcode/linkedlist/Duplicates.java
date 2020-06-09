package com.usecase.leetcode.linkedlist;

public class Duplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode next = head.next;

        while (next != null) {
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = next;
            }

            next = current.next;
        }

        return head;
    }
}
