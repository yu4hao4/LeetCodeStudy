import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-07-13-23:24
 */
public class intersection_of_two_arrays_ii_350 {
    /**
     * question url:https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
     * question context :
     * 给定两个数组，编写一个函数来计算它们的交集。
     */
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){
                return new int[0];
            }

            HashMap<Integer,Integer> map = new HashMap<>();

            List<Integer> list = new ArrayList<>();

            for (int value : nums1) {
                if (map.containsKey(value)) {
                    map.put(value, map.get(value) + 1);
                } else {
                    map.putIfAbsent(value, 1);
                }
            }

            for (int value : nums2) {
                if (map.containsKey(value) && map.get(value) != 0) {
                    list.add(value);
                    map.put(value, map.get(value) - 1);
                }

                if (map.get(value) != null && map.get(value) <= 0) {
                    map.remove(value);
                }
            }

            int[] ans = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        intersection_of_two_arrays_ii_350 intersection_of_two_arrays_ii_350 = new intersection_of_two_arrays_ii_350();
        System.out.println(
                Arrays.toString(intersection_of_two_arrays_ii_350.new Solution().intersect(nums1, nums2))
        );
    }
}
