package com.usecase.leetcode.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {

    public static ListNode run(ListNode l1, ListNode l2) {
        return new AddTwoNumbers().addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cur = root;

        ListNode node1 = l1;
        ListNode node2 = l2;

        int carry = 0;

        while (node1 != null || node2 != null) {
            int x = node1 == null ? 0 : node1.val;
            int y = node2 == null ? 0 : node2.val;

            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);
            cur = cur.next;

            if (node1 != null) {
                node1 = node1.next;
            }

            if (node2 != null) {
                node2 = node2.next;
            }
        }

        if (carry == 1) {
            cur.next = new ListNode(carry);
        }

        return root.next;
    }
}
//runtime:3 ms
//memory:39.7 MB

