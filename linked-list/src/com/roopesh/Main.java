package com.roopesh;

public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertFirst(5);
        list1.insertFirst(3);
        list1.insertFirst(1);
        list1.print();

        list2.insertFirst(7);
        list2.insertFirst(6);
        list2.insertFirst(4);
        list2.insertFirst(2);
        list1.print();
    }
}

