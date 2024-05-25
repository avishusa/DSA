//LeetCode Problem 73 (Arrays)

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

// Example 1:
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Example 2:
// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

class Solution {
    public static void get0mat(boolean[][] id, int row, int col) {
        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < id[i].length; j++) {
                if (i == row || j == col) {
                    id[i][j] = true;
                }
            }
        }
    }

    public void setZeroes(int[][] arr) {

        boolean[][] id = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    get0mat(id, i, j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (id[i][j]) {
                    arr[i][j] = 0;
                }
            }

        }
    }
}