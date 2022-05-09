package com.roopesh;

import java.util.List;

public class MergeSort {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyhead = new ListNode();
        ListNode tail = dummyhead;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2;
        return dummyhead.next;
    }

    public static ListNode findMiddle(ListNode head) {
        ListNode midPrev = null;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode getMid(ListNode head) {
        ListNode midPrev = null;

        while(head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next ;
            head = head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public static void main(String[] args) {
        ListNode list12 = new ListNode(37);
        ListNode list1 = new ListNode(51, list12);

        System.out.println(list1.val);
        System.out.println(list1.next.val);

        ListNode sorted = sortList(list1);
        System.out.println(sorted.val);
        System.out.println(sorted.next.val);
    }
}

