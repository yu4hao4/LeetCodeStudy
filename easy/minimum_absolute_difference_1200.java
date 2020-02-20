package easy;

import java.util.*;

/**
 * @author 喻浩
 * @create 2020-02-11-19:26
 */
public class minimum_absolute_difference_1200 {
    /**
     * question url:https://leetcode-cn.com/problems/minimum-absolute-difference/
     * question context :
     * 给你个整数数组 arr，其中每个元素都 不相同。
     *
     * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
     */
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            int l = arr.length;
            int min = arr[l-1] - arr[0];
            List<List<Integer>> res = new ArrayList<>();

            // 遍历第一遍找出min gap
            for (int i = 1; i < l; i++) {
                min = Math.min(min, arr[i] - arr[i-1]);
            }

            // 遍历第二遍相邻元素gap与min gap比较即可
            for (int i = 1; i < l; i++) {
                List<Integer> pair = new ArrayList<>();
                if (min == arr[i] - arr[i-1]) {
                    pair.add(arr[i-1]);
                    pair.add(arr[i]);
                    res.add(pair);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] arr = {40,11,26,27,-20};
        minimum_absolute_difference_1200 minimum_absolute_difference_1200 = new minimum_absolute_difference_1200();
        System.out.println(minimum_absolute_difference_1200.new Solution().minimumAbsDifference(arr));
    }
}
