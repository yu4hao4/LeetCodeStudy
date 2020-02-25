package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-20-15:01
 */
public class shu_zu_zhong_zhong_fu_de_shu_zi_lcof_mianshi03 {
    /**
     * question url:https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/  
     * question context :
     * 找出数组中重复的数字。
     *
     *
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     */
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Arrays.sort(nums);
            
            int pre = Integer.MIN_VALUE;

            for (int num : nums) {
                if (num == pre){
                    return num;
                }
                pre = num;
            }
            
            return pre;
        }
    }
    
    public static void main(String[] args) {
        shu_zu_zhong_zhong_fu_de_shu_zi_lcof_mianshi03 shu_zu_zhong_zhong_fu_de_shu_zi_lcof_mianshi03 = new shu_zu_zhong_zhong_fu_de_shu_zi_lcof_mianshi03();
        System.out.println(shu_zu_zhong_zhong_fu_de_shu_zi_lcof_mianshi03.new Solution());;
    }
}
