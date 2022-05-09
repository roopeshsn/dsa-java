package com.roopesh;

public class InterviewQuestions {
    public static void main(String[] args) {
        System.out.println("Interview Questions");
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode node) {
        val = x;
        next = node;
    }
}