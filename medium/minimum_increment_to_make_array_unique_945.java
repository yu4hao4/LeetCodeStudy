package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author 喻浩
 * @create 2020-03-22-12:41
 */
public class minimum_increment_to_make_array_unique_945 {
    /**
     * question url:https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/
     * question context :
     * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
     *
     * 返回使 A 中的每个值都是唯一的最少操作次数。
     */
    class Solution {
        public int minIncrementForUnique(int[] A) {
            int ans = 0;
            if (A == null || A.length <= 1){
                return ans;
            }

            Arrays.sort(A);

            for (int i = 1; i < A.length; i++) {
                if ( A[i] <= A[i-1] ){
                    ans++;
                    A[i]++;
                    i--;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
//        int[] nums = {1,2,2};
        minimum_increment_to_make_array_unique_945 minimum_increment_to_make_array_unique_945 = new minimum_increment_to_make_array_unique_945();
        System.out.println(minimum_increment_to_make_array_unique_945.new Solution().minIncrementForUnique(nums));;
    }
}
