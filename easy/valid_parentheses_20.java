package easy;

import java.util.Stack;

/**
 * @author yuhao5
 * @date 2020-06-30
 */
public class valid_parentheses_20 {
    /**
     * question url:https://leetcode-cn.com/problems/valid-parentheses/
     * question context :
     */
    class Solution {
        public boolean isValid(String s) {
            if (s == null || s.length() == 0){
                return true;
            }

            if (s.length() == 1){
                return false;
            }

            Stack stack = new Stack();

            int len = s.length();

            for (int i = 0; i < len; i++) {
                char charAt = s.charAt(i);
                if (charAt == '(' || charAt == '{' || charAt == '[' ){
                    stack.push(charAt);
                    continue;
                }

                if (stack.isEmpty()){
                    return false;
                }

                char peek = (char)stack.peek();
                if (peek == '(' && charAt == ')'){
                    stack.pop();
                } else if (peek == '{' && charAt == '}'){
                    stack.pop();
                } else if (peek == '[' && charAt == ']'){
                    stack.pop();
                } else {
                    return false;
                }
            }

            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        valid_parentheses_20 valid_parentheses_20 = new valid_parentheses_20();
        System.out.println(valid_parentheses_20.new Solution());;
    }
}
