package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2020-02-20-14:16
 */
public class yong_liang_ge_zhan_shi_xian_dui_lie_lcof_mianshi09 {
    /**
     * question url:https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
     * question context :
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     */
    class Solution {
    
    }

    static class CQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if (stack1.isEmpty()){
                return -1;
            }
            
            if (stack1.size() <= 1){
                return stack1.pop();
            }
            
            while (stack1.size() != 1){
                Integer pop = stack1.pop();
                stack2.push(pop);
            }
            
            Integer result = stack1.pop();
            
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            
            return result;
        }
    }
    
    public static void main(String[] args) {
//        yong_liang_ge_zhan_shi_xian_dui_lie_lcof_mianshi09 yong_liang_ge_zhan_shi_xian_dui_lie_lcof_mianshi09 = new yong_liang_ge_zhan_shi_xian_dui_lie_lcof_mianshi09();
//        System.out.println(yong_liang_ge_zhan_shi_xian_dui_lie_lcof_mianshi09.new Solution());;

        CQueue obj = new CQueue();
        obj.appendTail(1);
        int param_2 = obj.deleteHead();
        System.out.println(param_2);
    }
}
