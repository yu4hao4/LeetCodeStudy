package medium;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2020-03-14-13:48
 */
public class longest_increasing_subsequence_300 {
    /**
     * question url:https://leetcode-cn.com/problems/longest-increasing-subsequence/
     * question context :
     * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
     */
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if (nums.length <= 1){
                return nums.length;
            }

            int[] dp = new int[nums.length];
            dp[0] = 1;
            int maxLen = 1;
            for (int i = 1; i < nums.length; i++) {
                int maxVal = 0;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]){
                        maxVal = Math.max(maxVal,dp[j]);
                    }
                }

                dp[i] = maxVal+1;
                maxLen = Math.max(maxLen, dp[i]);
            }
            return maxLen;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        longest_increasing_subsequence_300 longest_increasing_subsequence_300 = new longest_increasing_subsequence_300();
        System.out.println(
                longest_increasing_subsequence_300.new Solution().lengthOfLIS(nums)
        );
    }
}
