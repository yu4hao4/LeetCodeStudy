import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-04-21-9:17
 */
public class merge_sorted_array_88 {
    /**
     * question url:https://leetcode-cn.com/problems/merge-sorted-array/
     * question context :
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     * 说明:
     *
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     */
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
        }
    }

    public static void main(String[] args) {
        merge_sorted_array_88 merge_sorted_array_88 = new merge_sorted_array_88();
        System.out.println(merge_sorted_array_88.new Solution());;
    }
}
