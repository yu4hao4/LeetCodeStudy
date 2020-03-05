package easy;

import java.util.*;

/**
 * @author 喻浩
 * @create 2020-03-04-17:57
 */
public class rotting_oranges_994 {
    /**
     * question url:https://leetcode-cn.com/problems/rotting-oranges/
     * question context :
     * 在给定的网格中，每个单元格可以有以下三个值之一：
     *
     * 值 0 代表空单元格；
     * 值 1 代表新鲜橘子；
     * 值 2 代表腐烂的橘子。
     * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
     *
     * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
     */
    class Solution {
//        public int orangesRotting(int[][] grid) {
//            int isOk = 0;
//            LinkedList<int[]> queue = new LinkedList();
//
//            for (int i = 0; i < grid.length; i++) {
//                for (int j = 0; j < grid[i].length; j++) {
//                    //完好橘子数量
//                    if (grid[i][j] == 1){
//                        isOk++;
//                    }
//
//                    //腐烂橘子的坐标
//                    if (grid[i][j] == 2){
//                        queue.add(new int[]{i,j});
//                    }
//                }
//            }
//
//            if (isOk == 0 && queue.size() ==0){
//                return 0;
//            }
//
//            //花费最少时间
//            int spendTime = 0;
//            //当前腐烂橘子数量
//            int currentTimeNum = queue.size();
//            //下一阶段腐烂橘子数量
//            int nextTimeNum = 0;
//            while (!queue.isEmpty()){
//                int[] location = queue.remove(0);
//                if (location[0] > 0 && location[1] >= 0 && grid[location[0] -1][location[1]] == 1){
//                    //左边
//                    grid[location[0] -1][location[1]] = 2;
//                    queue.add(new int[]{location[0] -1,location[1]});
//                    isOk--;
//                }
//                if (location[0] < grid.length-1 && location[1] >= 0 && grid[location[0] +1][location[1]] == 1){
//                    //右边
//                    grid[location[0] +1][location[1]] = 2;
//                    queue.add(new int[]{location[0] +1,location[1]});
//                    isOk--;
//                }
//
//                if (location[0] >= 0 && location[1] > 0 && grid[location[0]][location[1]-1] == 1){
//                    //上边
//                    grid[location[0]][location[1]-1] = 2;
//                    queue.add(new int[]{location[0],location[1]-1});
//                    isOk--;
//                }
//                if (location[0] >= 0 && location[1] < grid.length-1 && grid[location[0]][location[1]+1] == 1){
//                    //下边
//                    grid[location[0]][location[1]+1] = 2;
//                    queue.add(new int[]{location[0],location[1]+1});
//                    isOk--;
//                }
//
//                currentTimeNum--;
//
//                //当前腐烂橘子已经遍历完毕
//                if (currentTimeNum == 0){
//                    spendTime++;
//                    currentTimeNum = queue.size();
//                }
//            }
//
//            if (isOk != 0){
//                return -1;
//            }
//
//            return spendTime-1;
//
//        }

        int[] dr = new int[]{-1, 0, 1, 0};
        int[] dc = new int[]{0, -1, 0, 1};

        public int orangesRotting(int[][] grid) {
            int R = grid.length, C = grid[0].length;

            // queue : all starting cells with rotten oranges
            Queue<Integer> queue = new ArrayDeque();
            Map<Integer, Integer> depth = new HashMap();
            for (int r = 0; r < R; ++r)
                for (int c = 0; c < C; ++c)
                    if (grid[r][c] == 2) {
                        int code = r * C + c;
                        queue.add(code);
                        depth.put(code, 0);
                    }

            int ans = 0;
            while (!queue.isEmpty()) {
                int code = queue.remove();
                int r = code / C, c = code % C;
                for (int k = 0; k < 4; ++k) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];
                    if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        int ncode = nr * C + nc;
                        queue.add(ncode);
                        depth.put(ncode, depth.get(code) + 1);
                        ans = depth.get(ncode);
                    }
                }
            }

            for (int[] row: grid)
                for (int v: row)
                    if (v == 1)
                        return -1;
            return ans;

        }
    }

    public static void main(String[] args) {
//        int[][] nums = {{2,1,1},{1,1,0},{0,1,1}};
//        int[][] nums = {{2,1,1},{0,1,1},{1,0,1}};
        int[][] nums = {{1},{2}};
        rotting_oranges_994 rotting_oranges_994 = new rotting_oranges_994();
        System.out.println(rotting_oranges_994.new Solution().orangesRotting(nums));
    }
}
