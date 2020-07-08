package diffcult;

import java.util.Map;
import java.util.Stack;

/**
 * @author yuhao5
 * @date 2020-07-04
 */
public class longest_valid_parentheses_32 {
    /**
     * question url:https://leetcode-cn.com/problems/longest-valid-parentheses/
     * question context :
     * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度
     */
    class Solution {
        public int longestValidParentheses(String s) {
            if (s == null || s.length() < 2) {
                return 0;
            }

            int len = s.length();
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            int max = 0;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                }else {
                    stack.pop();
                    if (stack.isEmpty()){
                        stack.push(i);
                    } else {
                        max = Math.max(max, i-stack.peek());
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        longest_valid_parentheses_32 longest_valid_parentheses_32 = new longest_valid_parentheses_32();
        System.out.println(longest_valid_parentheses_32.new Solution());;
    }
}
