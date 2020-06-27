package medium;

/**
 * @author yuhao5
 * @date 2020-06-04
 */
public class product_of_array_except_self_238 {
    /**
     * question url:https://leetcode-cn.com/problems/product-of-array-except-self/
     * question context :
     * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
     *
     */
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            if (nums == null || nums.length == 0 || nums.length == 1){
                return new int[0];
            }

            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int num = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (j != i){
                        num *= nums[j];
                    }
                }
                ans[i] = num;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        product_of_array_except_self_238 product_of_array_except_self_238 = new product_of_array_except_self_238();
        System.out.println(product_of_array_except_self_238.new Solution());;
    }
}
