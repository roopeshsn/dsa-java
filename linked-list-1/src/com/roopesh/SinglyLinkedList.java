package com.roopesh;

import java.util.LinkedList;

public class SinglyLinkedList {

    public Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
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

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
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

    public int deleteLast() {
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size -= 1;
        return val;
    }

    public int delete(int idx) {
        if(idx == 0) {
            return deleteFirst();
        }

        if(idx == size - 1) {
            return deleteLast();
        }

        Node prev = get(idx-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size -= 1;
        return val;
    }

    public Node get(int idx) {
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Recursion version
    public int getUsingRecursion(int idx) {
        Node temp = head;
        Node node = getUsingRecursion(idx, temp);
        return node.value;
    }

    private Node getUsingRecursion(int idx, Node node) {
        if(idx == 0) {
            return node;
        }
        return getUsingRecursion(idx-1, node.next);
    }

    public void insertUsingRecursion(int val, int idx) {
        if(idx >= size) {
            return;
        }
        head = insertUsingRecursion(val, idx, head, head.value);
    }

    private Node insertUsingRecursion(int val, int idx, Node node, int currentNodeValue) {
        if(idx == 0) {
            Node temp = new Node(val, node);
            size += 1;
            return temp;
        }
        node.next = insertUsingRecursion(val, idx-1, node.next, node.next.value);
        return node;
    }

    // Remove duplicates from sorted LL
    public void removeDuplicates() {
        Node temp = head;
        while(temp.next != null) {
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    // Merge Linked Lists

    public static SinglyLinkedList merge(SinglyLinkedList first, SinglyLinkedList second) {
        Node f = first.head;
        Node s = second.head;

        SinglyLinkedList ans = new SinglyLinkedList();

        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
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

    public static void main(String[] args) {
        SinglyLinkedList first = new SinglyLinkedList();
        SinglyLinkedList second = new SinglyLinkedList();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.insertLast(9);
        first.insertLast(17);
        first.insertLast(21);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(4);
        SinglyLinkedList ans = SinglyLinkedList.merge(first, second);
        ans.print();
    }
}
