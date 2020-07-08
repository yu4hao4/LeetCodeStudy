package medium;

import java.util.Arrays;

/**
 * @author yuhao5
 * @date 2020-07-02
 */
public class find_first_and_last_position_of_element_in_sorted_array_34 {
    /**
     * question url:https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
     * question context :
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     *
     * 你的算法时间复杂度必须是 O(log n) 级别。
     *
     * 如果数组中不存在目标值，返回 [-1, -1]。
     */
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = new int[]{-1,-1};
            if (nums == null || nums.length == 0){
                return ans;
            }

            if (nums.length == 1 && nums[0] == target){
                return new int[]{0,0};
            }

            int begin = 0;
            int end = nums.length-1;

            while (begin <= end){
                if (nums[begin] == target && ans[0] == -1){
                    ans[0] = begin;
                }

                if (nums[end] == target && ans[1] == -1){
                    ans[1] = end;
                }

                if (ans[0] == -1){
                    begin++;
                }
                if (ans[1] == -1){
                    end--;
                }

                if (ans[0] != -1 && ans[1] != -1){
                    break;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3};
        find_first_and_last_position_of_element_in_sorted_array_34 find_first_and_last_position_of_element_in_sorted_array_34 = new find_first_and_last_position_of_element_in_sorted_array_34();
        System.out.println(
                Arrays.toString(find_first_and_last_position_of_element_in_sorted_array_34.new Solution().searchRange(nums, 1))
        );;
    }
}
