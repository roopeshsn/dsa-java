package com.roopesh;

import static com.roopesh.QuickSelect.quickSelect;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3, 8, 7, 6};
        int result = quickSelect(arr, 2);
        System.out.println(result);
    }
}
