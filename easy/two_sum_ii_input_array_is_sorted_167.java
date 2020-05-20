package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-05-17-9:58
 */
public class two_sum_ii_input_array_is_sorted_167 {
    /**
     * question url:https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
     * question context :
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     *
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     *
     * 说明:
     *
     * 返回的下标值（index1 和 index2）不是从零开始的。
     * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     */
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] ans = new int[2];
            int index = 0;
            int offset = 1;
            while (index < numbers.length){
                if (numbers[index] + numbers[index+offset] == target){
                    ans[0] = index + 1;
                    ans[1] = index + 1 + offset;
                    break;
                }

                if (numbers[index] + numbers[index+offset] < target){
                    offset++;
                    if (offset + index >= numbers.length){
                        index++;
                        offset = 1;
                    }

                    continue;
                }

                if (numbers[index] + numbers[index+offset] > target){
                    offset = 1;
                    index++;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,25,75};
        two_sum_ii_input_array_is_sorted_167 two_sum_ii_input_array_is_sorted_167 = new two_sum_ii_input_array_is_sorted_167();
        System.out.println(Arrays.toString(two_sum_ii_input_array_is_sorted_167.new Solution().twoSum(nums, 100)));
    }
}
