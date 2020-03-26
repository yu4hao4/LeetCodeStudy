package easy;

/**
 * @author 喻浩
 * @create 2020-03-25-12:49
 */
public class surface_area_of_3d_shapes_892 {
    /**
     * question url:https://leetcode-cn.com/problems/surface-area-of-3d-shapes/
     * question context :
     * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
     *
     * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
     *
     * 请你返回最终形体的表面积。
     *
     */
    class Solution {
        public int surfaceArea(int[][] grid) {
            int ans = 0,i,j,len = grid.length;
            for (i = 0; i < len; i++) {
                for (j = 0; j < len; j++) {
                    ans += (6*grid[i][j] - ((Math.max(grid[i][j] - 1, 0))*2));
                    if (i < len - 1){
                        ans -= Math.min(grid[i][j],grid[i+1][j])*2; //减去右方向重叠的两个面
                    }

                    if (j < len - 1){
                        ans -= Math.min(grid[i][j],grid[i][j+1])*2;//减去下方向重叠的两个面
                    }
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1,0},{0,2}};
        surface_area_of_3d_shapes_892 surface_area_of_3d_shapes_892 = new surface_area_of_3d_shapes_892();
        System.out.println(surface_area_of_3d_shapes_892.new Solution().surfaceArea(nums));
    }
}
