package medium;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2020-03-29-0:12
 */
public class as_far_from_land_as_possible_1162 {
    /**
     * question url:https://leetcode-cn.com/problems/as-far-from-land-as-possible/
     * question context :
     * 你现在手里有一份大小为 N x N 的『地图』（网格） grid，上面的每个『区域』（单元格）都用 0 和 1 标记好了。其中 0 代表海洋，1 代表陆地，你知道距离陆地区域最远的海洋区域是是哪一个吗？请返回该海洋区域到离它最近的陆地区域的距离。
     *
     * 我们这里说的距离是『曼哈顿距离』（ Manhattan Distance）：(x0, y0) 和 (x1, y1) 这两个区域之间的距离是 |x0 - x1| + |y0 - y1| 。
     *
     * 如果我们的地图上只有陆地或者海洋，请返回 -1。
     */
    class Solution {
        public int maxDistance(int[][] grid) {
            if (grid == null
                    || grid.length == 0
                    || grid[0].length == 0){
                return -1;
            }

            ArrayList<int[]> land = new ArrayList<>();
            ArrayList<int[]> ocean = new ArrayList<>();
            int len = grid.length;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (grid[i][j] == 1){
                        land.add(new int[]{i,j});
                    }else {
                        ocean.add(new int[]{i,j});
                    }
                }
            }

            if (land.size() == 0 || ocean.size() == 0) {
                return -1;//没有海洋或没有陆地
            }

            int max = -1;
            for (int i = 0;i < ocean.size();i++) {
                //求一片海洋到所有陆地的距离中最小的距离
                int min = 9999999;
                for (int j = 0;j < land.size();j++) {
                    int dis = distance(ocean.get(i), land.get(j));
                    if (dis < min) {
                        min = dis;
                    }
                    if (min == 1) {
                        break;//提前结束，最小可能的距离是1
                    }
                }
                //求最小距离中的最大距离
                if (min > max) {
                    max = min;
                }
            }
            return max;

        }

        /**
         * 曼哈顿距离
         * @param a
         * @param b
         * @returns {number}
         */
        public int distance(int[] a, int[] b) {
            return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
        }

    }

    public static void main(String[] args) {
        as_far_from_land_as_possible_1162 as_far_from_land_as_possible_1162 = new as_far_from_land_as_possible_1162();
        System.out.println(as_far_from_land_as_possible_1162.new Solution());;
    }
}
