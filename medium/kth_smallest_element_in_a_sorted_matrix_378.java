package medium;

import java.util.Arrays;

/**
 * @author yuhao5
 * @date 2020-07-02
 */
public class kth_smallest_element_in_a_sorted_matrix_378 {
    /**
     * question url:https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/
     * question context :
     * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
     * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
     */
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            if (matrix == null){
                return -1;
            }

            int len = matrix.length;
            int[] ans = new int[len*len];

            int i = 0;
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    ans[i++] = anInt;
                }
            }

            Arrays.sort(ans);
            return ans[k-1];
        }
    }

    public static void main(String[] args) {
        kth_smallest_element_in_a_sorted_matrix_378 kth_smallest_element_in_a_sorted_matrix_378 = new kth_smallest_element_in_a_sorted_matrix_378();
        System.out.println(kth_smallest_element_in_a_sorted_matrix_378.new Solution());;
    }
}
