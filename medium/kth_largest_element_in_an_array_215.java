package medium;

import java.util.Arrays;

/**
 * @author yuhao5
 * @date 2020-06-29
 */
public class kth_largest_element_in_an_array_215 {
    /**
     * question url:https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
     * question context :
     * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     */
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length- k];
        }
    }

    public static void main(String[] args) {
//        int[] nums = {3,2,1,5,6,4};
        int[] nums = {3,2,3,1,2,4,5,5,6};
        kth_largest_element_in_an_array_215 kth_largest_element_in_an_array_215 = new kth_largest_element_in_an_array_215();
        System.out.println(kth_largest_element_in_an_array_215.new Solution().findKthLargest(nums, 4));
    }
}
