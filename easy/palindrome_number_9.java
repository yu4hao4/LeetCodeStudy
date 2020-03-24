package easy;

/**
 * @author 喻浩
 * @create 2020-03-20-13:28
 */
public class palindrome_number_9 {
    /**
     * question url:https://leetcode-cn.com/problems/palindrome-number/
     * question context :
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     */
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0){
                return false;
            }

            StringBuilder str1 = new StringBuilder(""+x+x);
            StringBuilder str2 = new StringBuilder(""+x+x).reverse();
            System.out.println(str1 +" "+ str2);
            return String.valueOf(str1).equals(String.valueOf(str2));
        }
    }

    public static void main(String[] args) {
        palindrome_number_9 palindrome_number_9 = new palindrome_number_9();
        System.out.println(palindrome_number_9.new Solution().isPalindrome(10));;
    }
}
