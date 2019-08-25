package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2019-08-25-17:38
 */
public class squares_of_a_sorted_array_977 {
    /**
     * question url:https://leetcode-cn.com/problems/squares-of-a-sorted-array/
     * question context :
     * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
     */
    class Solution {
        public int[] sortedSquares(int[] A) {
            for(int i = 0;i < A.length;i++){
                A[i] = A[i]*A[i];
            }
            Arrays.sort(A);
            return A;
        }
    }
    
    public static void main(String[] args) {
        squares_of_a_sorted_array_977 squares_of_a_sorted_array_977 = new squares_of_a_sorted_array_977();
        System.out.println(squares_of_a_sorted_array_977.new Solution());;
    }
}
