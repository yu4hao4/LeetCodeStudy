package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-21-16:58
 */
public class he_wei_sde_liang_ge_shu_zi_lcof_mianshi57 {
    /**
     * question url:https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
     * question context :
     * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int end = nums.length-1;
            for (int i = end; i > 0; i--) {
                if (nums[i] > target){
                    //找到比 target 小的位置
                    end = i+1;
                    continue;
                }
                for (int i1 = 0; i1 < end; i1++) {
                    if ( (nums[i] + nums[i1]) == target){
                        return new int[]{nums[i],nums[i1]};
                    }
                    
                }
            }
            
            return nums;
        }
    }
    
    public static void main(String[] args) {
        
        he_wei_sde_liang_ge_shu_zi_lcof_mianshi57 he_wei_sde_liang_ge_shu_zi_lcof_mianshi57 = new he_wei_sde_liang_ge_shu_zi_lcof_mianshi57();
        System.out.println(
//                Arrays.toString(he_wei_sde_liang_ge_shu_zi_lcof_mianshi57.new Solution().twoSum(nums, 9))
                Arrays.toString(he_wei_sde_liang_ge_shu_zi_lcof_mianshi57.new Solution().twoSum(nums1, 40))
        );
    }
    
    static int[] nums1 = {10,26,30,31,47,60};
}
