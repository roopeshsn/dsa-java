package com.roopesh;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void print() {
        Node temp = head;
        if(head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
