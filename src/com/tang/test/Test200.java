package com.tang.test;

/** ClassName:Test200 Package:com.tang.test @Date:2021/10/23 13:55 @Author:TYH */
public class Test200 {
    public static void main(String[] args) {
        Solution200 solution200 = new Solution200();
        char[][] chars = {{'1', '1', '1'}, {'1', '1', '1'}, {'1', '1', '1'}};
        int i = solution200.numIslands(chars);
        System.out.println(i);
    }
}

class Solution200 {
    // row 行数 column列数
    private void dfs(char[][] nums, int r, int c) {
        int nr = nums.length;
        int nc = nums[0].length;
        if (r < 0 || c < 0 || r >= nr || c >= nc || nums[r][c] == '0') {
            return;
        }
        nums[r][c] = '0';
        dfs(nums, r - 1, c);
        dfs(nums, r + 1, c);
        dfs(nums, r, c + 1);
        dfs(nums, r, c - 1);
    }

    public int numIslands(char[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int countOfLand = 0;
        if (grid == null || nr == 0) return 0;
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == '1') {
                    countOfLand++;
                    dfs(grid, i, j);
                }
            }
        }
        return countOfLand;
    }
}
