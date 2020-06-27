package medium;

import java.util.Arrays;

/**
 * @author 喻浩
 * @date 2020-06-02
 */
public class rotate_image_48 {
    /**
     * question url:https://leetcode-cn.com/problems/rotate-image/
     * question context :
     * 给定一个 n × n 的二维矩阵表示一个图像。
     *
     * 将图像顺时针旋转 90 度。
     *
     * 说明：
     *
     * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
     */
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            int temp;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[n-j-1][n-i-1];
                    matrix[n-j-1][n-i-1] = temp;
                }
            }

            for (int j = 0; j < n / 2; j++) {
                for (int i = 0; i < n; i++) {
                    temp = matrix[j][i];
                    matrix[j][i] = matrix[n-j-1][i];
                    matrix[n-j-1][i] = temp;
                }
            }

            System.out.println(Arrays.deepToString(matrix));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate_image_48 rotate_image_48 = new rotate_image_48();
        rotate_image_48.new Solution().rotate(matrix);
    }
}
