package com.roopesh;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(4);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(1);
        // list.insertFirst(3);
        list.print();
        // list.insertUsingRecursion(7, 3);
        list.print();
        list.removeDuplicates();
        list.print();
//        System.out.println(list.getUsingRecursion(3));
//        list.print();
    }
}

