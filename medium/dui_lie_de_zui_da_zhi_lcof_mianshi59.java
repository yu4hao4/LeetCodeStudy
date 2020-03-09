package medium;

import java.util.LinkedList;

/**
 * @author 喻浩
 * @create 2020-03-07-16:31
 */
public class dui_lie_de_zui_da_zhi_lcof_mianshi59 {
    /**
     * question url:https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
     * question context :
     * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
     *
     * 若队列为空，pop_front 和 max_value 需要返回 -1
     */
    class MaxQueue {
        LinkedList<Integer> queue1;
        LinkedList<Integer> queue2;

        public MaxQueue() {
            queue1 = new LinkedList();
            queue2 = new LinkedList();
            queue2.add(0, Integer.MIN_VALUE);
        }

        public int max_value() {
            if (queue1.isEmpty()){
                return -1;
            }
            return queue2.get(0);
        }

        public void push_back(int value) {
            if (value > queue2.get(0)){
                queue2.add(0, value);
            } else {
                for (int i = 1; i < queue2.size(); i++) {
                    if (value > queue2.get(i)){
                        queue2.add(i, value);
                        break;
                    }

                    if (i == queue2.size()-1){
                        queue2.add(value);
                    }
                }
            }
            queue1.add(value);
        }

        public int pop_front() {
            if (queue1.isEmpty()){
                return -1;
            }
            Integer remove = queue1.remove(0);
            for (int i = 0; i < queue2.size(); i++) {
                if (queue2.get(i).equals(remove)){
                    queue2.remove(i);
                    break;
                }
            }
            return remove;
        }
    }

    public static void main(String[] args) {
        dui_lie_de_zui_da_zhi_lcof_mianshi59 dui_lie_de_zui_da_zhi_lcof_mianshi59 = new dui_lie_de_zui_da_zhi_lcof_mianshi59();
        System.out.println(dui_lie_de_zui_da_zhi_lcof_mianshi59);;
    }
}
