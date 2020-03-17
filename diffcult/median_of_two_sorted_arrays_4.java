package diffcult;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-17-8:31
 */
public class median_of_two_sorted_arrays_4 {
    /**
     * question url:https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
     * question context :
     * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
     *
     * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *
     * 你可以假设 nums1 和 nums2 不会同时为空。
     */
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] nums = new int[nums1.length + nums2.length];

            System.arraycopy(nums1, 0, nums, 0, nums1.length);
            System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);

            Arrays.sort(nums);

            return (nums.length & 1) == 0 ? (nums[nums.length/2-1] + nums[nums.length/2]) * 0.5 : nums[nums.length/2]*1.0;
        }
    }

    public static void main(String[] args) {
        median_of_two_sorted_arrays_4 median_of_two_sorted_arrays_4 = new median_of_two_sorted_arrays_4();
        System.out.println(median_of_two_sorted_arrays_4.new Solution());;
    }
}
