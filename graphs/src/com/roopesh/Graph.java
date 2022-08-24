package com.roopesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://takeuforward.org/data-structure/minimum-spanning-tree-mst-using-prims-algo/

class Node{
    int f;
    int s;
    public Node(int f, int s) {
        this.f = f;
        this.s = s;
    }
}

public class Graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        System.out.println(arr);
        for (int i = 1; i <= 5+1; i++) {
            arr.add(new ArrayList<>());
        }
        System.out.println(arr);
        add(arr,1,2);
        add(arr,1,3);
        add(arr,2,4);
        add(arr,3,4);
        add(arr,3,5);
        System.out.println(arr);
        ArrayList<Integer> result = BFS(5, arr);
        System.out.println(result);
        boolean isCycle = cycleDetectionBFS(5, arr);
        System.out.println(isCycle);
    }

    public static void add(ArrayList<ArrayList<Integer>> list, int from, int to) {
        list.get(from).add(to);
        list.get(to).add(from);
    }

    public static ArrayList<Integer> BFS(int v, ArrayList<ArrayList<Integer>> list) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[v+1];

        for (int i = 1; i <= v; i++) {
            if(!visited[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                visited[i] = true;

                while(!queue.isEmpty()) {
                    Integer node = queue.poll();
                    result.add(node);


                    for (Integer adjacent: list.get(node)) {
                        if(!visited[adjacent]) {
                            visited[adjacent] = true;
                            queue.add(adjacent);
                        }
                    }
                }
            }
        }

        return result;
    }

    public static boolean cycleDetectionBFS(int v, ArrayList<ArrayList<Integer>> list) {
        boolean[] visited = new boolean[v+1];
        Arrays.fill(visited, false);

        for (int i = 1; i <= v; i++) {
            if(!visited[i]) {
                if(cycleBFS(i, list, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean cycleBFS(int i, ArrayList<ArrayList<Integer>> list, boolean[] visited) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, -1));
        visited[i] = true;

        while(!queue.isEmpty()) {
            int node = queue.peek().f;
            int parent = queue.peek().s;
            queue.remove();

            for (Integer item:
                    list.get(node)) {
                if(!visited[item]) {
                    visited[item] = true;
                    queue.add(new Node(item, node));
                } else if (parent != item && visited[item]) {
                    return true;
                }
            }
        }

        return false;
    }
}