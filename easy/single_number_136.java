import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-04-11-15:34
 */
public class single_number_136 {
    /**
     * question url:https://leetcode-cn.com/problems/single-number/
     * question context :
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     */
    class Solution {
        public int singleNumber(int[] nums) {
            if (nums == null){
                return 0;
            }

            if( nums.length == 1) {
                return nums[0];
            }

            Arrays.sort(nums);

            Set<Integer> set = new HashSet<>();

            for (int num : nums) {
                if (set.contains(num)) {
                    set.remove(num);
                } else {
                    set.add(num);
                }
            }

            return set.iterator().next();
        }
    }

    public static void main(String[] args) {
//        int[] nums = {4,1,2,1,2};
//        int[] nums = {1,0,1};
//        int[] nums = {4,1,2,1,2};
        int[] nums = {2,2,1};
        single_number_136 single_number_136 = new single_number_136();
        System.out.println(single_number_136.new Solution().singleNumber(nums));
    }
}
