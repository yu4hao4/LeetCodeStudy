package easy;

/**
 * @author 喻浩
 * @create 2020-04-03-21:33
 */
public class remove_duplicates_from_sorted_array_26 {
    /**
     * question url:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     * question context :
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums == null || nums.length == 0){
                return 0;
            }
            int ans = 1;
            if (nums.length == 1){
                return ans;
            }

            for (int num : nums) {
                if (num == nums[ans-1]){
                    continue;
                }

                nums[ans++] = num;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1,1,2};
        remove_duplicates_from_sorted_array_26 remove_duplicates_from_sorted_array_26 = new remove_duplicates_from_sorted_array_26();
        System.out.println(remove_duplicates_from_sorted_array_26.new Solution().removeDuplicates(nums));
    }
}
