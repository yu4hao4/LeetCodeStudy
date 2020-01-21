package easy;

/**
 * @author 喻浩
 * @create 2020-01-21-21:23
 */
public class find_numbers_with_even_number_of_digits_1295 {
    /**
     * question url:https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
     * question context :
     * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
     */
    class Solution {
        public int findNumbers(int[] nums) {
            int result = 0;
            for (int num : nums) {
                if( (num/10 !=0 && num/100 == 0)
                        || (num/1000 != 0 && num/10000 == 0) ){
                    result++;
                }
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        find_numbers_with_even_number_of_digits_1295 find_numbers_with_even_number_of_digits_1295 = new find_numbers_with_even_number_of_digits_1295();
//        System.out.println(find_numbers_with_even_number_of_digits_1295.new Solution());;
        System.out.println(111%10);
    }
}
