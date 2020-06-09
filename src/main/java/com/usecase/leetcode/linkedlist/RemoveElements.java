package com.usecase.leetcode.linkedlist;

public class RemoveElements {

    //引入虚拟头结点的情况
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        //创建一个虚拟的头结点
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode current = dummyHead;

        while (current.next != null) {

            //current指向被删除元素的前一个元素,current.next就是要删除的元素
            if (current.next.val == val) {
                ListNode delNode = current.next;
                current.next = delNode.next;

                //删除该节点，直接赋值为null,让JVM进行垃圾回收就行了
                delNode.next = null;
            } else {
                current = current.next;
            }
        }

        return dummyHead.next;
    }

}
