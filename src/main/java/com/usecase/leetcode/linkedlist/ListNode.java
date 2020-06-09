package com.usecase.leetcode.linkedlist;

public class ListNode {
    int val;
    ListNode root;
    ListNode next;

    ListNode(int x) {
        val = x;
        root = this;
    }

    public ListNode next(int x) {
        this.next = new ListNode(x);
        this.next.root = this.root;
        return this.next;
    }

    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
