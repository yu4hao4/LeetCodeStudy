package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-01-22-21:51
 */
public class add_digits_258 {
    /**
     * question url:https://leetcode-cn.com/problems/add-digits/
     * question context :
     * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
     */
    class Solution {
        public int addDigits(int num) {
            if(num == 0){
                return 0;
            }
            return num % 9 == 0 ? 9 : num % 9;
        }
    }
    
    public static void main(String[] args) {
        add_digits_258 add_digits_258 = new add_digits_258();
        System.out.println(add_digits_258.new Solution());;
    }
}
