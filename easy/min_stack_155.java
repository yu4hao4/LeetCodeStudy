import java.util.LinkedList;

/**
 * @author 喻浩
 * @create 2020-04-12-9:52
 */
public class min_stack_155 {
    /**
     * question url:https://leetcode-cn.com/problems/min-stack/
     * question context :
     * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
     *
     * push(x) —— 将元素 x 推入栈中。
     * pop() —— 删除栈顶的元素。
     * top() —— 获取栈顶元素。
     * getMin() —— 检索栈中的最小元素。
     */
    static class MinStack {
        LinkedList<Integer> linkedList;
        int min = Integer.MAX_VALUE;

        /** initialize your data structure here. */
        public MinStack() {
            linkedList = new LinkedList<>();
        }

        public void push(int x) {
            if (x < min){
                min = x;
            }

            linkedList.addLast(x);
        }

        public void pop() {
            Integer integer = linkedList.removeLast();
            if (integer == min){
                min = Integer.MAX_VALUE;
                linkedList.forEach(item -> {
                    if (item < min){
                        min = item;
                    }
                });
            }
        }

        public int top() {
            return linkedList.getLast();
        }

        public int getMin() {
            return min;
        }
    }

    public static void main(String[] args) {
        min_stack_155 min_stack_155 = new min_stack_155();
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
    }
}
