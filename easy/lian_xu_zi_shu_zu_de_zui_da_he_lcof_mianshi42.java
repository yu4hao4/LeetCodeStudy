package easy;

/**
 * @author 喻浩
 * @create 2020-02-22-17:32
 */
public class lian_xu_zi_shu_zu_de_zui_da_he_lcof_mianshi42 {
    /**
     * question url:https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
     * question context :
     * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     *
     * 要求时间复杂度为O(n)。
     */
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int num : nums) {
                sum = Math.max( sum + num , num);
                max = Math.max( sum, max);
            }
            return max;
        }
    }
    
    public static void main(String[] args) {
        lian_xu_zi_shu_zu_de_zui_da_he_lcof_mianshi42 lian_xu_zi_shu_zu_de_zui_da_he_lcof_mianshi42 = new lian_xu_zi_shu_zu_de_zui_da_he_lcof_mianshi42();
        System.out.println(lian_xu_zi_shu_zu_de_zui_da_he_lcof_mianshi42.new Solution());;
    }
}
