package medium;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-20-16:18
 */
public class spiral_matrix_ii_59 {
    /**
     * question url:https://leetcode-cn.com/problems/spiral-matrix-ii/
     * question context :
     * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
     */
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] result = new int[n][n];
            int num = 1;
            int left = 0;
            int right = n-1;
            int top = 0;
            int bottom = n-1;
            int x = 0;
            int y = 0;
            
            boolean topOk = false;
            boolean bottomOk = false;
            boolean leftOk = false;
            boolean rightOk = false;
            

            System.out.println(right+" "+bottom);
            result[x++][y] = num++;
            while (num <= n*n){

                result[y][x] = num++;
//                result[x][y] = num++;
                System.out.println(x +" "+ y);
                System.out.println("left:"+left+" right:"+right+" top:"+top+" bottom:"+bottom);
                System.out.println(Arrays.deepToString(result));
                System.out.println("------------------------------");
                
                if (y == top && x != left && x != right){//在上边界
                    x++;
                }else if (y == bottom && x != left && x < right){//在下边界
                    x--;
                }else if (x == right && y != bottom && y != top){//在右边界
                    y++;
                }else if (x == left && y != bottom && y != top){//在左边界
                    y--;
                }else if (x == right && y == top){ //右上边界
                    topOk = true;
                    y++;
                    continue;
                }else if (x == right && y == bottom){ //右下边界
                    rightOk = true;
                    x--;
                    continue;
                }else if (x == left && y == bottom){ //左下边界
                    bottomOk = true;
                    y--;
                    continue;
                }else if (x == left && y == top) { //左上边界
                    leftOk = true;
                    x++;
                    continue;
                }

                if (topOk){
                    //上边界下移
                    top++;
                    topOk = false;
                }

                if (bottomOk){
                    //下边界上移
                    bottom--;
                    bottomOk = false;
                }

                if (leftOk){
                    //左边界右移
                    left++;
                    leftOk = false;
                }

                if (rightOk){
                    //右边界左移
                    right--;
                    rightOk = false;
                }

            }
            
            return result;
        }
    }
    
    public static void main(String[] args) {
        spiral_matrix_ii_59 spiral_matrix_ii_59 = new spiral_matrix_ii_59();
        System.out.println(
                Arrays.deepToString(spiral_matrix_ii_59.new Solution().generateMatrix(3))
        );
    }
}
