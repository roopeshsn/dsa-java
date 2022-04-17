package com.roopesh;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void curiosity(){
        System.out.println(head.value);
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head; // List will already have a head. So, we need to tranfer the head to the new node
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node; // List will already have a tail. So, we need to tranfer the tail to the new node
            tail = node;
            size++;
        }
    }

    public void insert(int idx, int val) {
        if(idx == 0) {
            insertFirst(val);
            return;
        }

        if(idx == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        // Node node = new Node(val);
        // node.next = temp.next;
        if(temp == null) {
            System.out.println("Insertion failed");
            return;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size -= 1;
        return val;
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
