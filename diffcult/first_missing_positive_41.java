/**
 * @author 喻浩
 * @create 2020-06-27-17:05
 */
public class first_missing_positive_41 {
    /**
     * question url:https://leetcode-cn.com/problems/first-missing-positive/
     * question context :
     * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
     */
    class Solution {
        public int firstMissingPositive(int[] nums) {
            if (nums == null || nums.length == 0){
                return 1;
            }

            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                while (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i]]){
                    ans = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[ans] = ans;
                }
            }

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != i){
                    return i;
                }
            }

            return nums[0] == nums.length ? nums.length+1 : nums.length;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,0};
//        int[] nums = {3,4,-1,1};
        int[] nums = {-1,4,2,1,9,10};
        first_missing_positive_41 first_missing_positive_41 = new first_missing_positive_41();
        System.out.println(first_missing_positive_41.new Solution().firstMissingPositive(nums));
    }
}
