package com.roopesh;

public class MinHeap {
    private int[] Heap;
    private int size;
    private int maxSize;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize];
    }
}
