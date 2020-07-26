/**
 * @author 喻浩
 * @create 2020-07-20-20:58
 */
public class valid_palindrome_125 {
    /**
     * question url:https://leetcode-cn.com/problems/valid-palindrome/
     * question context :
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     *
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     */
    class Solution {
        public boolean isPalindrome(String s) {
            int begin = 0;
            int end = s.length()-1;
            s = s.toLowerCase();
            while (begin < end){
                if (s.charAt(begin)  > 122 || (s.charAt(begin) < 97 && s.charAt(begin) > 57) || s.charAt(begin) < 48){
                    begin++;
                    continue;
                }
                if (s.charAt(end)  > 122 || (s.charAt(end) < 97 && s.charAt(end) > 57) || s.charAt(end) < 48){
                    end--;
                    continue;
                }

                if (s.charAt(begin) != s.charAt(end)){
                    return false;
                }else {
                    begin++;
                    end--;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        valid_palindrome_125 valid_palindrome_125 = new valid_palindrome_125();
        System.out.println(valid_palindrome_125.new Solution());;
    }
}
