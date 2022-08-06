package com.roopesh;

import java.util.Arrays;

public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize];
    }

    public int size() {
        return size;
    }

    private int parent(int idx) {
        return (idx - 1) / 2;
    }

    private int left(int idx) {
        return (2 * idx) + 1;
    }

    private int right(int idx) {
        return (2 * idx) + 2;
    }

    private void swap(int first, int second) {
        int temp;
        temp = Heap[first];
        Heap[first] = Heap[second];
        Heap[second] = temp;
    }

    public void insert(int val) {
        Heap[size] = val;
        int current = size;

        while(Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }

        size++;
    }

    public int extractMax() {
        int max = Heap[0];
        swap(0, --size);
        heapifyDown(0);
        return max;
    }

    public void heapifyDown(int idx) {
        int left = left(idx);
        int right = right(idx);
        int largest = idx;

        if (left < size && Heap[left] > Heap[idx]) {
            largest = left;
        }

        if (right < size && Heap[right] > Heap[largest]) {
            largest = right;
        }

        if(largest != idx) {
            swap(idx, largest);
            heapifyDown(largest);
        }
    }

    public void print() {
        System.out.println(Arrays.toString(Heap));
    }
}
