package easy;

/**
 * @author 喻浩
 * @create 2019-09-02-17:58
 */
public class sort_array_by_parity_905 {
    /**
     * question url:https://leetcode-cn.com/problems/sort-array-by-parity/
     * question context :
     * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
     *
     * 你可以返回满足此条件的任何数组作为答案。
     */
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int i=0,j=A.length-1,temp;
            while(i < j){
                if(A[i] % 2 == 0 || A[i] == 0){
                    i++;
                }else if(A[j] % 2 != 0){
                    j--;
                }else if(A[i] % 2 != 0 && A[j] % 2 == 0){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    i++;
                    j--;
                }
            }
            return A;
        }
    }
    
    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        sort_array_by_parity_905 sort_array_by_parity_905 = new sort_array_by_parity_905();
        for(int i : sort_array_by_parity_905.new Solution().sortArrayByParity(A)){
            System.out.println(i);
        }
    }
}
