/**
 * @author 喻浩
 * @create 2020-07-12-21:56
 */
public class number_of_good_pairs_5460 {
    /**
     * question url:https://leetcode-cn.com/problems/number-of-good-pairs/
     * question context :
     * 给你一个整数数组 nums 。
     *
     * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
     *
     * 返回好数对的数目。
     *
     */
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int ans = 0;
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                for (int j = i+1; j < length; j++) {
                    if (nums[i] == nums[j]){
                        ans++;
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        number_of_good_pairs_5460 number_of_good_pairs_5460 = new number_of_good_pairs_5460();
        System.out.println(number_of_good_pairs_5460.new Solution());;
    }
}
