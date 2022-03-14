package com.tang.test;

/** ClassName:Test695 Package:com.tang.test @Date:2021/10/24 19:06 @Author:TYH */
public class Test695 {}

class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 遍历数组中的每一个数,如果为1则进行深度优先遍历,并返回其面积值
                max = Math.max(max, getArea(grid, i, j));
            }
        }
        return max;
    }

    public int getArea(int[][] nums, int i, int j) {
        int r = nums.length;
        int c = nums[0].length;
        // 判断返回(越界or值为0)
        if (i < 0 || j < 0 || i >= r || j >= c || nums[i][j] == 0) {
            return 0;
        }
        int area = 1;
        nums[i][j] = 0;

        area += getArea(nums, i - 1, j);
        area += getArea(nums, i + 1, j);
        area += getArea(nums, i, j - 1);
        area += getArea(nums, i, j + 1);

        return area;
    }
}
