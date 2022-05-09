package com.roopesh;

public class DoublyLinkedList {
    private Node head;
//    private Node tail;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
//        if(tail == null) {
//            tail = head;
//        }
        size++;
    }

    public void insertLast(int val) {
//        if(tail == null) {
//            insertFirst(val);
//        } else {
//            Node node = new Node(val);
//            tail.next = node;
//            node.prev = tail;
//            tail = node;
//            size++;
//        }
        Node node = new Node(val);
        if(head == null) {
            insertFirst(val);
            return;
        }
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public void insert(int val, int idx) {
//        if(idx == 0) {
//            insertFirst(val);
//            return;
//        }
//
//        if(idx == size) {
//            insertLast(val);
//            return;
//        }

        Node prevNode = get(idx);
        Node nextNode = prevNode.next;
//        if(node == null) {
//            System.out.println("Insertion failed");
//            return;
//        }
        Node newNode = new Node(val, prevNode, nextNode);
        prevNode.next = newNode;
        nextNode.prev = newNode;
        size += 1;
    }

    public Node get(int idx) {
        Node node = head;
        for (int i = 1; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public void print() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
//
//    public int deleteFirst() {
//        int val = head.value;
//        head = head.next;
//        if(head == null) {
//            tail = null;
//        }
//        size -= 1;
//        return val;
//    }
//
//    public int deleteLast() {
//        if(size <= 1){
//            deleteFirst();
//        }
//        SinglyLinkedList.Node secondLast = get(size-2);
//        int val = tail.value;
//        tail = secondLast;
//        tail.next = null;
//        size -= 1;
//        return val;
//    }
//
//    public int delete(int idx) {
//        if(idx == 0) {
//            return deleteFirst();
//        }
//
//        if(idx == size - 1) {
//            return deleteLast();
//        }
//
//        SinglyLinkedList.Node prev = get(idx-1);
//        int val = prev.next.value;
//        prev.next = prev.next.next;
//        size -= 1;
//        return val;
//    }
//
//    public SinglyLinkedList.Node get(int idx) {
//        SinglyLinkedList.Node node = head;
//        for (int i = 0; i < idx; i++) {
//            node = node.next;
//        }
//        return node;
//    }
//
//    public SinglyLinkedList.Node find(int value) {
//        SinglyLinkedList.Node node = head;
//        while(node != null) {
//            if(node.value == value) {
//                return node;
//            }
//            node = node.next;
//        }
//        return null;
//    }

    private class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
