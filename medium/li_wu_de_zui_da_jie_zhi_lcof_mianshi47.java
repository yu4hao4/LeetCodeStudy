package medium;

/**
 * @author 喻浩
 * @create 2020-02-28-13:07
 */
public class li_wu_de_zui_da_jie_zhi_lcof_mianshi47 {
    /**
     * question url:https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
     * question context :
     * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
     * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
     * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
     */
    class Solution {
        public int maxValue(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int[][] maxValue = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == 0 && j ==0){
                        maxValue[i][j] = grid[i][j];
                    }else if (i == 0){
                        maxValue[i][j] = grid[i][j] + maxValue[i][j-1];
                    }else if (j == 0){
                        maxValue[i][j] = grid[i][j] + maxValue[i-1][j];
                    }else {
                        maxValue[i][j] = Math.max(maxValue[i-1][j],maxValue[i][j-1]) + grid[i][j];
                    }
                }
            }

            return maxValue[rows-1][cols-1];
        }
    }

    public static void main(String[] args) {
        li_wu_de_zui_da_jie_zhi_lcof_mianshi47 li_wu_de_zui_da_jie_zhi_lcof_mianshi47 = new li_wu_de_zui_da_jie_zhi_lcof_mianshi47();
        System.out.println(li_wu_de_zui_da_jie_zhi_lcof_mianshi47.new Solution());;
    }
}
