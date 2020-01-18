package easy;

/**
 * @author 喻浩
 * @create 2020-01-18-12:06
 */
public class toeplitz_matrix_766 {
    /**
     * question url:https://leetcode-cn.com/problems/toeplitz-matrix/
     * question context :
     * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
     *
     * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
     */
    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            if (matrix.length == 1){
                return true;
            }
            for (int i = 0; i < matrix.length; i++) {
                if(!isEqual(i, 0, matrix)){
                    return false;
                }
            }
            
            for (int i = 0; i < matrix[0].length; i++) {
                if(!isEqual(0, i, matrix)){
                    return false;
                }
            }
            
            return true;
        }
        
        public boolean isEqual(int row,int col,int[][] matrix){
            int temp = matrix[row][col];
            while (row < matrix.length && col < matrix[0].length){
                if(matrix[row][col] != temp){
                    return false;
                }
                row++;
                col++;
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
        int[][] test = new int[][]{{1,2},{2,2}};
        toeplitz_matrix_766 toeplitz_matrix_766 = new toeplitz_matrix_766();
        System.out.println(toeplitz_matrix_766.new Solution().isToeplitzMatrix(test));
    }
}
