package medium;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-28-14:04
 */
public class shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56 {
    /**
     * question url:https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
     * question context :
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     */
    class Solution {
        public int[] singleNumbers(int[] nums) {
            Arrays.sort(nums);
            int[] result = new int[2];
            int index = 0;
            System.out.println(Arrays.toString(nums));
            for (int i = 0; i < nums.length; i++) {
                if (i < nums.length-1 && nums[i] == nums[i+1]){
                    i++;
                }else if (i < nums.length-1 && nums[i] != nums[i+1]){
                    result[index++] = nums[i];
                    if (index >= 2){
                        break;
                    }
                }else {
                    result[1] = nums[i];
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,1,4,6};
        shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56 shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56 = new shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56();
        System.out.println(
                Arrays.toString(
                        shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56.new Solution().singleNumbers(nums)
                )
        );
    }
}
