package easy;

import java.util.HashMap;

/**
 * @author 喻浩
 * @create 2020-03-19-13:07
 */
public class longest_palindrome_409 {
    /**
     * question url:https://leetcode-cn.com/problems/longest-palindrome/
     * question context :
     * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
     *
     * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
     */
    class Solution {
        public int longestPalindrome(String s) {
            if (s == null || s.length() == 0){
                return 0;
            }

            int ans = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == null){
                    map.put(s.charAt(i), 1);
                }else {
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                }
            }

            boolean flag = true;
            for (Character character : map.keySet()) {
                if ( map.get(character) == 1){
                    if (flag) {
                        ans += 1;
                        flag = false;
                    }

                    continue;
                }

                if (map.get(character) > 1 && ( (map.get(character) & 1) == 0 )){
                    ans += map.get(character);
                }

                if (map.get(character) > 1 && ( (map.get(character) & 1) == 1 )){
                    ans += map.get(character)-1;
                    if (flag) {
                        ans += 1;
                        flag = false;
                    }
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        longest_palindrome_409 longest_palindrome_409 = new longest_palindrome_409();
        System.out.println(longest_palindrome_409.new Solution().longestPalindrome("abccccdd"));;
    }
}
