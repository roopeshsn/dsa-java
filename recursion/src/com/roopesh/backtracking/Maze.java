package com.roopesh.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3,3));
        // path("", 3,3 );
        // System.out.println(pathList("", 3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathWithObstacle("", board, 0, 0);
    }

    public static int count(int row, int col) {
        if(row == 1 | col == 1) {
            return 1;
        }
        int left = count(row-1, col);
        int right = count(row, col - 1);
        return left + right;
    }

    public static void path(String p, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            path(p + 'D', row-1, col);
        }
        if (col > 1) {
            path(p + 'R', row, col - 1);
        }
    }

    public static ArrayList<String> pathList(String p, int row, int col) {
        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathList(p + 'D', row-1, col));
        }
        if (col > 1) {
            list.addAll(pathList(p + 'R', row, col - 1));
        }
        return list;
    }

    public static void pathWithObstacle(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[row][col]) {
            return ;
        }
        if (row < maze.length - 1) {
            pathWithObstacle(p + 'D', maze, row+1, col);
        }
        if (col < maze[0].length - 1) {
            pathWithObstacle(p + 'R', maze, row, col+1);
        }
    }

    public static ArrayList<String> pathListWithObstacle(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
//        if(!maze[row][col]) {
//            return;
//        }
        if (row < maze.length - 1) {
            list.addAll(pathListWithObstacle(p + 'D', maze,row+1, col));
        }
        if (col < maze[0].length - 1) {
            list.addAll(pathListWithObstacle(p + 'R', maze, row, col+1));
        }
        return list;
    }
}
