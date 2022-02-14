package com.roopesh.array;

// s -> start
// e -> end
// m -> mid
// t -> target
// a -> arr

public class RBS {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 1, 2, 3};
        int ans = search(a, 2, 0, a.length);
        System.out.println(ans);
    }

    static int search(int[] a, int t, int s, int e) {
        if(s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;

        if(a[m] == t) {
            return m;
        }

        if(a[s] <= a[m]) {
            if(t >= a[s] & t <= m) {
                return search(a, t, s, m-1);
            } else {
                return search(a, t, m+1, e);
            }
        }

        if(t >= a[m] & t <= a[e]) {
            return search(a, t, m+1, e);
        }
        return search(a, t, s, m-1);
    }
}
