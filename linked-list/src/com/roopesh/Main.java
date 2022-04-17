package com.roopesh;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertLast(21);
        list.print();
        list.curiosity();
        list.insert(2, 76);
        list.print();
//        list.deleteFirst();
//        list.printList();
//        list.deleteLast();
//        list.printList();
        list.delete(2);
        list.print();
        System.out.println(list.find(3));
    }
}

