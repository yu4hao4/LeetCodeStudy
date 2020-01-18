package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-01-17-20:02
 */
public class cells_with_odd_values_in_a_matrix_1252 {
    /**
     * question url:https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/
     * question context :
     * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
     *
     * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
     *
     * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
     *
     * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。
     */
    class Solution {
        public int oddCells(int n, int m, int[][] indices) {
            int[][] calMatlab = new int[n][m];

            for (int[] index : indices) {
                rowAdd(index[0],calMatlab);
                colAdd(index[1],calMatlab);
            }

//            for (int[] ints : calMatlab) {
//                System.out.println(Arrays.toString(ints));
//            }
            return getOddNum(calMatlab);
        }
        
        public int getOddNum(int[][] matlab){
            int result = 0;
            for (int[] index : matlab) {
                for (int i : index) {
                    if (i %2 != 0){
                        //奇数
                        result++;
                    }
                }
            }
            return result;
        }
        
        public void rowAdd(int row ,int[][] matlab){
            for (int i = 0; i < matlab[row].length; i++) {
                matlab[row][i]++;
            }
        }
        
        public void colAdd(int col ,int[][] matlab){
            for (int i = 0; i < matlab.length; i++) {
                matlab[i][col]++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] test = new int[][]{{0,1},{1,1}};
        cells_with_odd_values_in_a_matrix_1252 cells_with_odd_values_in_a_matrix_1252 = new cells_with_odd_values_in_a_matrix_1252();
        System.out.println(cells_with_odd_values_in_a_matrix_1252.new Solution().oddCells(2, 3, test));
    }
}
