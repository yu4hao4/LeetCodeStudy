package medium;

import java.util.Arrays;

/**
 * @author yuhao5
 * @date 2020-07-07
 */
public class sum_3_closest_16 {
    /**
     * question url:https://leetcode-cn.com/problems/3sum-closest/
     * question context :
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
     */
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int len = nums.length;
            int maxClose = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < len - 2; i++) {
                int begin = i+1;
                int end = len-1;
                while (begin < end){
                    int sum = nums[i] + nums[begin] + nums[end];
                    int distance = Math.abs(sum - target);
                    if (distance < maxClose){
                        maxClose = distance;
                        ans = sum;
                    }

                    if (sum < target){
                        begin++;
                    } else if (sum > target){
                        end--;
                    } else {
                        return sum;
                    }
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        sum_3_closest_16 sum_3_closest_16 = new sum_3_closest_16();
        System.out.println(sum_3_closest_16.new Solution());;
    }
}
