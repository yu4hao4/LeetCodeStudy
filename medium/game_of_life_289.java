package medium;

/**
 * @author 喻浩
 * @create 2020-04-02-13:41
 */
public class game_of_life_289 {
    /**
     * question url:https://leetcode-cn.com/problems/game-of-life/
     * question context :
     * 根据 百度百科 ，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。
     *
     * 给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞都具有一个初始状态：1 即为活细胞（live），或 0 即为死细胞（dead）。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：
     *
     * 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
     * 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
     * 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
     * 如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
     * 根据当前状态，写一个函数来计算面板上所有细胞的下一个（一次更新后的）状态。下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。
     */
    class Solution {
        public void gameOfLife(int[][] board) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    liveOrDeath(i,j,board);
                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == -1){
                        board[i][j] = 0;
                    }
                    if (board[i][j] == -2 || board[i][j] == -3){
                        board[i][j] = 1;
                    }
                    if (board[i][j] < -3){
                        board[i][j] = 0;
                    }
                    if (board[i][j] == 3){
                        board[i][j] = 1;
                    }


                }
            }

        }

        public void liveOrDeath(int x, int y,int[][] board){
            int num = 0;

            //上
            for (int i = Math.max(x - 1, 0); i < Math.min(x + 1, board[0].length); i++) {
                if (board[i][Math.max(y-1, 0)] == 1){
                    num++;
                }
            }

            //左
            for (int i = y; i < Math.min(y + 1, board.length); i++) {
                if (board[Math.max(x-1, 0)][i] == 1){
                    num++;
                }
            }

            //右
            for (int i = y; i < Math.min(y + 1, board.length); i++) {
                if (board[Math.min(x+1, board[0].length)][i] == 1){
                    num++;
                }
            }

            if (y + 1 < board[0].length && board[x][y+1] == 1){
                num++;
            }

            if (board[x][y] == 1){
                board[x][y] = -num;
            }else {
                board[x][y] = num;
            }

        }
    }

    public static void main(String[] args) {
        game_of_life_289 game_of_life_289 = new game_of_life_289();
        System.out.println(game_of_life_289.new Solution());;
    }
}
