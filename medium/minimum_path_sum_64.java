package medium;

/**
 * @author yuhao5
 * @date 2020-07-23
 */
public class minimum_path_sum_64 {
    /**
     * question url:https://leetcode-cn.com/problems/minimum-path-sum/
     * question context :
     * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
     *
     * 说明：每次只能向下或者向右移动一步。
     */
    class Solution {
        public int minPathSum(int[][] grid) {
            if (grid == null || grid.length == 0){
                return 0;
            }

            int width = grid.length;
            int height = grid[0].length;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {

                    if (j== 0 && i > 0){
                        grid[i][j] += grid[i-1][j];
                    }

                    if (i == 0 && j > 0){
                        grid[i][j] += grid[i][j-1];
                    }

                    if (i > 0 && j > 0){
                        grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                    }
                }
            }

            return grid[width-1][height-1];
        }
    }

    public static void main(String[] args) {
        minimum_path_sum_64 minimum_path_sum_64 = new minimum_path_sum_64();
        System.out.println(minimum_path_sum_64.new Solution());;
    }
}
