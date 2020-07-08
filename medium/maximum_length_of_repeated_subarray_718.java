package medium;

/**
 * @author yuhao5
 * @date 2020-07-01
 */
public class maximum_length_of_repeated_subarray_718 {
    /**
     * question url:https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
     * question context :
     * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
     */
    class Solution {
        public int findLength(int[] A, int[] B) {
            int max = Integer.MIN_VALUE;
            int[] dp = new int[Math.max(A.length, B.length)+1];
            for (int i = 1; i <= A.length; i++) {
                for (int j = B.length; j > 0; j--) {
                    if (A[i-1] == B[j-1]){
                        dp[j] = dp[j-1] + 1;
                        max = Math.max(max, dp[j]);
                    } else {
                        dp[j] = 0;
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,2,1};
        int[] B = {3,2,1,4,7};
        maximum_length_of_repeated_subarray_718 maximum_length_of_repeated_subarray_718 = new maximum_length_of_repeated_subarray_718();
        System.out.println(maximum_length_of_repeated_subarray_718.new Solution().findLength(A,B));
    }
}
