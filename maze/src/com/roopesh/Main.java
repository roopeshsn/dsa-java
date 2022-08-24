package com.roopesh;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        boolean[][] maze = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true}
//        };
//        allPaths("", maze, 0, 0);
        int ans = count(3, 3);
        System.out.println(ans);
    }

    static int count(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }
        int left = count(row-1, col);
        int right = count(row, col-1);
        return left + right;
    }

    static void path(String p, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if(row > 1) {
            path(p+'D', row-1, col);
        }

        if(col > 1) {
            path(p+'R', row, col-1);
        }
    }

    static ArrayList<String> pathRet(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();
        if(row == 1 && col == 1) {
            list.add(p);
            return list;
        }

        if(row > 1) {
            list.addAll(pathRet(p+'D', row-1, col));
        }

        if(row > 1 && col > 1) {
            list.addAll(pathRet(p+'d', row-1, col-1));
        }

        if(col > 1) {
            list.addAll(pathRet(p+'R', row, col-1));
        }

        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        if(row < maze.length - 1) {
            pathRestrictions(p+'D', maze, row+1, col);
        }

        if(col < maze[0].length - 1) {
            pathRestrictions(p+'R', maze, row, col+1);
        }
    }

    static void allPaths(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if(row < maze.length - 1) {
            allPaths(p+'D', maze, row+1, col);
        }

        if(col < maze[0].length - 1) {
            allPaths(p+'R', maze, row, col+1);
        }

        if(row > 0) {
            allPaths(p+'U', maze, row-1, col);
        }

        if(col > 0) {
            allPaths(p+'L', maze, row, col-1);
        }

        maze[row][col] = true;
    }
}
