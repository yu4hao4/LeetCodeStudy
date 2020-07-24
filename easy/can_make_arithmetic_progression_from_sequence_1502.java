package easy;

import java.util.Arrays;

/**
 * @author yuhao5
 * @date 2020-07-08
 */
public class can_make_arithmetic_progression_from_sequence_1502 {
    /**
     * question url:https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
     * question context :
     * 给你一个数字数组 arr 。
     *
     * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
     *
     * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
     */
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
//            int num = (arr[arr.length-1] - arr[0])/(arr.length-1);
//            for (int i = 0; i < arr.length-1; i++) {
//                if (arr[i] + num != arr[i+1]){
//                    return false;
//                }
//            }
            for (int i = 1; i < arr.length-1; i++) {
                if ((arr[i] - arr[i-1]) != (arr[i+1] - arr[i])){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        can_make_arithmetic_progression_from_sequence_1502 can_make_arithmetic_progression_from_sequence_1502 = new can_make_arithmetic_progression_from_sequence_1502();
        System.out.println(can_make_arithmetic_progression_from_sequence_1502.new Solution());;
    }
}
