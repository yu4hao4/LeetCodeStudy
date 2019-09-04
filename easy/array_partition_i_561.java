package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2019-09-04-10:12
 */
public class array_partition_i_561 {
    /**
     * question url:https://leetcode-cn.com/problems/array-partition-i/
     * question context :
     * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
     */
    class Solution {
        public int arrayPairSum(int[] nums) {
            int result = 0;
            int count = nums.length-1;
            Arrays.sort(nums);
            while(count > 0){
                result += nums[count-1];
                count -= 2;
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        int[] s = {1,4,3,2};
        array_partition_i_561 array_partition_i_561 = new array_partition_i_561();
        System.out.println(array_partition_i_561.new Solution().arrayPairSum(s));
    }
}
