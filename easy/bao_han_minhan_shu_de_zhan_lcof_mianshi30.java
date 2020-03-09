package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2020-03-06-18:47
 */
public class bao_han_minhan_shu_de_zhan_lcof_mianshi30 {
    /**
     * question url:https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
     * question context :
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
     */
    class MinStack {
        Stack stack;
        int min = Integer.MAX_VALUE;

        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack();
        }

        public void push(int x) {
            if (x < min){
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            stack.pop();
            if (!stack.isEmpty()){
                min = (int) stack.peek();
                for (Object o : stack) {
                    if ((int)o < min){
                        min = (int) o;
                    }
                }
            }else {
                min = Integer.MAX_VALUE;
            }
        }

        public int top() {
            return (int) stack.peek();
        }

        public int min() {
            return min;
        }
    }

    public static void main(String[] args) {
        bao_han_minhan_shu_de_zhan_lcof_mianshi30 bao_han_minhan_shu_de_zhan_lcof_mianshi30 = new bao_han_minhan_shu_de_zhan_lcof_mianshi30();
    }
}
