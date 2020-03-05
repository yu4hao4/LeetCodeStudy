package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-03-14:16
 */
public class sorted_merge_lcci_mianshi10_01 {
    /**
     * question url:https://leetcode-cn.com/problems/sorted-merge-lcci/
     * question context :
     * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
     *
     * 初始化 A 和 B 的元素数量分别为 m 和 n。
     */
    class Solution {
        public void merge(int[] A, int m, int[] B, int n) {
            for (int i = 0; i < n; i++) {
                A[m+i] = B[i];
            }
            Arrays.sort(A);
        }
    }

    public static void main(String[] args) {
        sorted_merge_lcci_mianshi10_01 sorted_merge_lcci_mianshi10_01 = new sorted_merge_lcci_mianshi10_01();
        System.out.println(sorted_merge_lcci_mianshi10_01.new Solution());;
    }
}
