package com.roopesh.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        // allPaths("", maze, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    public static void allPaths(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[row][col]) {
            return ;
        }
        maze[row][col] = false;
        if (row < maze.length - 1) {
            allPaths(p + 'D', maze, row+1, col);
        }
        if (col < maze[0].length - 1) {
            allPaths(p + 'R', maze, row, col+1);
        }
        if (row > 0) {
            allPaths(p + 'U', maze, row-1, col);
        }
        if (col > 0) {
            allPaths(p + 'L', maze, row, col-1);
        }
        maze[row][col] = true;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            // System.out.println(Arrays.deepToString(path));
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
