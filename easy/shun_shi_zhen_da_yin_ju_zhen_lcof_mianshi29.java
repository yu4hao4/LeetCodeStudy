package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-09-12:19
 */
public class shun_shi_zhen_da_yin_ju_zhen_lcof_mianshi29 {
    /**
     * question url:https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
     * question context :
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
     */
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
                return new int[0];
            }
            int x = matrix.length;
            int y = matrix[0].length;
            int[] res = new int[x*y];

            int top=0;
            int bottom = y-1;
            int left = 0;
            int right = x-1;

            int index = 0;

            loop:{
                while (true){
                    for (int i = top; i <= bottom; i++) {
                        res[index++] = matrix[left][i];
                        if (index >= res.length){
                            break loop;
                        }
                    }
                    left++;

                    for (int i = left; i <= right; i++) {
                        res[index++] = matrix[i][bottom];
                        if (index >= res.length){
                            break loop;
                        }
                    }
                    bottom--;

                    for (int i = bottom; i >= top; i--) {
                        res[index++] = matrix[right][i];
                        if (index >= res.length){
                            break loop;
                        }
                    }
                    right--;

                    for (int i = right; i >= left ; i--) {
                        res[index++] = matrix[i][top];
                        if (index >= res.length){
                            break loop;
                        }
                    }
                    top++;
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        shun_shi_zhen_da_yin_ju_zhen_lcof_mianshi29 shun_shi_zhen_da_yin_ju_zhen_lcof_mianshi29 = new shun_shi_zhen_da_yin_ju_zhen_lcof_mianshi29();
        System.out.println(
                Arrays.toString(
                        shun_shi_zhen_da_yin_ju_zhen_lcof_mianshi29.new Solution().spiralOrder(matrix)
                )
        );
    }
}
