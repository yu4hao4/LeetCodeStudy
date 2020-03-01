package medium;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2020-03-01-17:27
 */
public class zhan_de_ya_ru_dan_chu_xu_lie_lcof_mianshi31 {
    /**
     * question url:https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/
     * question context :
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
     */
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int index = 0;
            for (int value : pushed) {
                stack.push(value);
                while (!stack.isEmpty() && stack.peek() == popped[index]) {
                    stack.pop();
                    index++;
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        zhan_de_ya_ru_dan_chu_xu_lie_lcof_mianshi31 zhan_de_ya_ru_dan_chu_xu_lie_lcof_mianshi31 = new zhan_de_ya_ru_dan_chu_xu_lie_lcof_mianshi31();
        System.out.println(zhan_de_ya_ru_dan_chu_xu_lie_lcof_mianshi31.new Solution().validateStackSequences(pushed, popped));;
    }
}
