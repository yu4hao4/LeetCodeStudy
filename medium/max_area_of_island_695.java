package medium;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2020-03-15-11:15
 */
public class max_area_of_island_695 {
    /**
     * question url:https://leetcode-cn.com/problems/max-area-of-island/
     * question context :
     * 给定一个包含了一些 0 和 1的非空二维数组 grid ,
     * 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。
     * 你可以假设二维矩阵的四个边缘都被水包围着。
     * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)
     */
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            if (grid.length == 0 || grid[0].length == 0){
                return 0;
            }
            int max = 0;
            int width = grid.length;
            int height = grid[0].length;

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (grid[i][j] == 1){
                        max = Math.max(max, dfs(i, j, grid));
                    }
                }
            }

            return max;
        }

        public int dfs(int x,int y,int[][] grid){
            if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0){
                return 0;
            }
            grid[x][y] = 0;
            int num = 1;
            num += dfs(x+1, y, grid);
            num += dfs(x-1, y, grid);
            num += dfs(x, y+1, grid);
            num += dfs(x, y-1, grid);

            return num;
        }
    }

    public static void main(String[] args) {
        max_area_of_island_695 max_area_of_island_695 = new max_area_of_island_695();
        System.out.println(max_area_of_island_695.new Solution());;
    }
}
