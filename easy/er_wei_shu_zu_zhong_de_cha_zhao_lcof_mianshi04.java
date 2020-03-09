package easy;

import java.time.temporal.Temporal;

/**
 * @author 喻浩
 * @create 2020-03-06-17:56
 */
public class er_wei_shu_zu_zhong_de_cha_zhao_lcof_mianshi04 {
    /**
     * question url:https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
     * question context :
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
                return false;
            }

            if (target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1]){
                return false;
            }

            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    if (anInt == target){
                        return true;
                    }
                }
            }


            return false;
        }
    }

    public static void main(String[] args) {
        int[][] x = {{-1,3}};
        er_wei_shu_zu_zhong_de_cha_zhao_lcof_mianshi04 er_wei_shu_zu_zhong_de_cha_zhao_lcof_mianshi04 = new er_wei_shu_zu_zhong_de_cha_zhao_lcof_mianshi04();
        System.out.println(er_wei_shu_zu_zhong_de_cha_zhao_lcof_mianshi04.new Solution().findNumberIn2DArray(x, -1));
    }
}
