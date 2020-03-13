package easy;

import java.util.HashMap;

/**
 * @author 喻浩
 * @create 2020-03-13-9:51
 */
public class majority_element_169 {
    /**
     * question url:https://leetcode-cn.com/problems/majority-element/
     * question context :
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     */
    class Solution {
        public int majorityElement(int[] nums) {
            int num = nums.length/2;
            HashMap<Integer,Integer> map = new HashMap<>();

            for (int i : nums) {
                if (!map.containsKey(i)){
                    map.put(i, num);
                }else {
                    map.put(i, map.get(i)-1);
                }

                if (map.get(i) <= 0){
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
//        int[] nums = {3,2,3};
        majority_element_169 majority_element_169 = new majority_element_169();
        System.out.println(majority_element_169.new Solution().majorityElement(nums));
    }
}
