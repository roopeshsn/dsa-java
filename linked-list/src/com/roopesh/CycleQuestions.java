package com.roopesh;

public class CycleQuestions {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = fast.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }


    public int findCycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = fast.next;
            if(fast == slow) {
                int length = 0;
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length += 1;
                } while(temp != slow);
                return length;
            }
        }

        return 0;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}
