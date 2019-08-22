package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2019-08-22-15:37
 */
public class remove_outermost_parentheses_1021 {
    /**
     * question url:https://leetcode-cn.com/problems/remove-outermost-parentheses/
     * question context :
     * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
     *
     * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
     *
     * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
     *
     * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
     * 
     * 这道题我的解决思路就是，通过栈来存储括号，当栈为空的时候，代表拿到了原语中左右括号的坐标，
     * 通过循环，加到result字符串汇中
     * 
     * 数据结构真的很重要，上学期学的，暑假就忘了，这道题其实很简单。
     * 但是想了很久，算法题还是得多练，多做。
     *
     */
    class Solution {
        public String removeOuterParentheses(String S) {
            String result = "";
            Stack<Integer> stack = new Stack<Integer>();
            char[] chars = S.toCharArray();
            Integer pop = null;
            for(int i = 0;i < chars.length;i++){
                if('(' == chars[i]){
                    stack.push(i);
                }
                if(')' == chars[i]){
                    pop = stack.pop();
                }
                if(stack.isEmpty() && pop != null){
                    for(int j = pop+1;j < i;j++){
                        result += chars[j];
                    }
                }
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        remove_outermost_parentheses_1021 remove_outermost_parentheses_1021 = new remove_outermost_parentheses_1021();
        System.out.println(remove_outermost_parentheses_1021.new Solution().removeOuterParentheses("(()())(())"));;
    }
}
