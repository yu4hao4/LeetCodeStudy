package easy;

/**
 * @author 喻浩
 * @create 2020-03-15-12:16
 */
public class two_sum_1 {
    /**
     * question url:https://leetcode-cn.com/problems/two-sum/
     * question context :
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] + nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[0];
        }
    }

    public static void main(String[] args) {
        two_sum_1 two_sum_1 = new two_sum_1();
        System.out.println(two_sum_1.new Solution());;
    }
}
