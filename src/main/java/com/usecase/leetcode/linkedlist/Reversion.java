package com.usecase.leetcode.linkedlist;

public class Reversion {

    //写法一：非递归方式(很好理解)
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;

        while (current != null) {
            //反转链表
            current.next = previous;
            previous = current;
            current = next;

            //注意当 cur指向最后一个元素时，此时next==null,不存在next.next的用法
            if (next != null) {
                next = next.next;
            }
        }

        //循环结束后，pre指向的位置就是头节点位置
        return previous;
    }

    //写法二：非递归方式(推荐写法)
    public static ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            // next指针指向的元素实际上就是 cur指针的指向的下一个元素

            //反转链表
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    //写法三：递归写法(不推荐，但也是一种思路)
    public static ListNode reverseList3(ListNode head) {
        //递归结束条件：head==null 或者只有head一个节点,直接返回head即可
        if (head == null || head.next == null) {
            return head;
        }

        ListNode last = head.next;

        //反转链表后,head是链表最后一个节点
        head.next = null;

        //反转链表后获取的新的头节点
        ListNode newHead = reverseList3(last);

        //last节点此时是该链表的最后一个节点
        last.next = head;
        return newHead;
    }

    // 1、找到 m 位置元素，从 m位置到后面(n-m)位置进行反转
    // 2、每次反转总是将当前元素的的后继元素反转到 m 位置,所以这里引入了pre指针，指向m位置的前1个位置
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }

        if (m >= n) {
            //注意当 m == n时，实际上是不需要反转的的
            return head;
        }

        //引入虚拟头节点，方便后续操作，比如，不需要判断 pre == null
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode previous = dummyHead;

        for (int i = 1; i < m; i++) {
            previous = previous.next;
        }

        //m位置的节点
        ListNode current = previous.next;

        for (int i = 0; i < (n - m); i++) {
            ListNode next = current.next;

            //tmp就是要翻转的元素
            current.next = next.next;
            next.next = previous.next;

            previous.next = next;
        }

        return dummyHead.next;
    }

}
