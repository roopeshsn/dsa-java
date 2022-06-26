package com.roopesh;

import java.util.LinkedList;
import java.util.Queue;

public class InBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(21);
        queue.add(3);
        queue.add(23);
        queue.add(15);

        System.out.println(queue.remove());

        System.out.println(queue);
    }
}
