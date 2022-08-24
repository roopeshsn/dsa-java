package com.roopesh;

// Implemented through UNION BY RANK and PATH COMPRESSION
// 3 operations
// makeSet
// findSet
// union

public class Disjoint {
    static int[] parent = new int[10];
    static int[] rank = new int[10];

    public static void makeSet() {
        for (int i = 1; i <= 10; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public static int findParent(int node) {
        if(node == parent[node]) {
            return node;
        }
        return parent[node] = findParent(parent[node]);
    }

    public static void union(int u, int v) {
        u = findParent(u);
        v = findParent(v);
        if(rank[u] < rank[v]) {
            parent[u] = v;
        } else if(rank[v] < rank[u]) {
            parent[v] = u;
        } else {
            parent[v] = u;
            rank[u]++;
        }
    }

    public static void main(String[] args) {
        makeSet();
        int p1 = findParent(1);
        System.out.println(p1);
    }
}
