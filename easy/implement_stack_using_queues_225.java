package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 喻浩
 * @create 2020-03-01-14:48
 */
public class implement_stack_using_queues_225 {
    /**
     * question url:https://leetcode-cn.com/problems/implement-stack-using-queues/
     * question context :
     * 使用队列实现栈的下列操作：
     *
     * push(x) -- 元素 x 入栈
     * pop() -- 移除栈顶元素
     * top() -- 获取栈顶元素
     * empty() -- 返回栈是否为空
     *
     */
    class MyStack {
        LinkedList<Integer> queue;

        /** Initialize your data structure here. */
        public MyStack() {
            queue = new LinkedList();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(queue.size(), x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue.remove(queue.size()-1);
        }

        /** Get the top element. */
        public int top() {
            return queue.get(queue.size()-1);
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.size() == 0;
        }
    }

    public static void main(String[] args) {
        implement_stack_using_queues_225 implement_stack_using_queues_225 = new implement_stack_using_queues_225();
        System.out.println(implement_stack_using_queues_225.new MyStack());;
    }
}
