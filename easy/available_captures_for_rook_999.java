package easy;

/**
 * @author 喻浩
 * @create 2020-03-26-16:08
 */
public class available_captures_for_rook_999 {
    /**
     * question url:https://leetcode-cn.com/problems/available-captures-for-rook/
     * question context :
     * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
     *
     * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
     *
     * 返回车能够在一次移动中捕获到的卒的数量。
     */
    class Solution {
        public int numRookCaptures(char[][] board) {
            int len = 8,x = 0,y = 0,ans = 0;
            find:{
                for (int i = 0; i < len; i++) {
                    for (int j = 0; j < len; j++) {
                        if (board[i][j] == 'R'){
                            x = i;
                            y = j;
                            break find;
                        }
                    }
                }
            }

            //上
            int temp = x;
            for (int i = temp; i < len; i++) {
                if (board[i][y] == 'p'){
                    ans++;
                    break;
                }

                if (
                        board[i][y] == 'B'){
                    break;
                }
            }

            temp = x;
            for (int i = temp; i > 0; i--) {
                if (board[i][y] == 'p'){
                    ans++;
                    break;
                }

                if (
                        board[i][y] == 'B'){
                    break;
                }
            }
            temp = y;
            for (int i = temp; i > 0; i--) {
                if (board[x][i] == 'p'){
                    ans++;
                    break;
                }

                if (
                        board[x][i] == 'B'){
                    break;
                }
            }

            temp = y;
            for (int i = temp; i < len; i++) {
                if (board[x][i] == 'p'){
                    ans++;
                    break;
                }

                if (
                        board[x][i] == 'B'){
                    break;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        char[][] arr = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        available_captures_for_rook_999 available_captures_for_rook_999 = new available_captures_for_rook_999();
        System.out.println(available_captures_for_rook_999.new Solution().numRookCaptures(arr));
    }
}
