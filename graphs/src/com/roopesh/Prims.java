package com.roopesh;
import java.util.ArrayList;

class Node {
    private int value;
    private int weight;

    Node(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    Node() {
        this.value = 0;
        this.weight = 0;
    }

    int getValue() {
        return this.value;
    }

    int getWeight() {
        return this.weight;
    }
}

public class Prims {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Node>> adj = new ArrayList<ArrayList<Node>>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Node>());
        }

        adj.get(0).add(new Node(1, 2));
        adj.get(1).add(new Node(0, 2));

        adj.get(1).add(new Node(2, 3));
        adj.get(2).add(new Node(1, 3));

        adj.get(0).add(new Node(3, 6));
        adj.get(3).add(new Node(0, 6));

        adj.get(1).add(new Node(3, 8));
        adj.get(3).add(new Node(1, 8));

        adj.get(1).add(new Node(4, 5));
        adj.get(4).add(new Node(1, 5));

        adj.get(2).add(new Node(4, 7));
        adj.get(4).add(new Node(2, 7));

        prims(adj, v);
    }

    public static void prims(ArrayList<ArrayList<Node>> adj, int v) {
        int[] edges = new int[v];
        int[] parent = new int[v];
        boolean[] MST = new boolean[v];

        for (int i = 0; i < v; i++) {
            edges[i] = Integer.MAX_VALUE;
            parent[i] = -1;
            MST[i] = false;
        }

        edges[0] = 0;

        for (int i = 0; i < v-1; i++) {
            int min = Integer.MAX_VALUE;
            int adjNode = 0;

            for (int j = 0; j < v; j++) {
                if(!MST[j] && edges[i] < min) {
                    adjNode = j;
                }
            }

            MST[adjNode] = true;

            for (Node item:
                    adj.get(adjNode)) {
                if(!MST[item.getValue()] && item.getWeight() < edges[item.getValue()]) {
                    parent[item.getValue()] = adjNode;
                    edges[item.getValue()] = item.getWeight();
                }
            }

        }
        for(int i = 1;i<v;i++) {
            System.out.println(parent[i] + " - " + i);
        }
    }
}
