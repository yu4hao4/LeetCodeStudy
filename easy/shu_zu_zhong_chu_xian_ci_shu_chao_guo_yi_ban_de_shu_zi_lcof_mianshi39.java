package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-21-16:46
 */
public class shu_zu_zhong_chu_xian_ci_shu_chao_guo_yi_ban_de_shu_zi_lcof_mianshi39 {
    /**
     * question url:https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
     * question context :
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     */
    class Solution {
        public int majorityElement(int[] nums) {
            if (nums.length == 1){
                return nums[0];
            }

            Arrays.sort(nums);
            
            int num = nums.length/2;
            int number = 1;
            
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1]){
                    if (++number > num){
                        return nums[i];
                    }
                }else {
                    number = 1;
                }
            }
            
            return -1;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        shu_zu_zhong_chu_xian_ci_shu_chao_guo_yi_ban_de_shu_zi_lcof_mianshi39 shu_zu_zhong_chu_xian_ci_shu_chao_guo_yi_ban_de_shu_zi_lcof_mianshi39 = new shu_zu_zhong_chu_xian_ci_shu_chao_guo_yi_ban_de_shu_zi_lcof_mianshi39();
        System.out.println(shu_zu_zhong_chu_xian_ci_shu_chao_guo_yi_ban_de_shu_zi_lcof_mianshi39.new Solution().majorityElement(nums));;
    }
}
