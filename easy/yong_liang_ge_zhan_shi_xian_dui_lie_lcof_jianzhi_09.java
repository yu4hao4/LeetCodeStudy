package easy;

import java.util.ArrayList;

/**
 * @author yuhao5
 * @date 2020-06-30
 */
public class yong_liang_ge_zhan_shi_xian_dui_lie_lcof_jianzhi_09 {
    /**
     * question url:https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
     * question context :
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     */
    class CQueue {
        ArrayList<Integer> list;

        public CQueue() {
            list = new ArrayList();
        }

        public void appendTail(int value) {
            list.add(value);
        }

        public int deleteHead() {
            if (list.size() < 1){
                return -1;
            }
            return list.remove(0);
        }
    }

    public static void main(String[] args) {
        yong_liang_ge_zhan_shi_xian_dui_lie_lcof_jianzhi_09 yong_liang_ge_zhan_shi_xian_dui_lie_lcof_jianzhi_09 = new yong_liang_ge_zhan_shi_xian_dui_lie_lcof_jianzhi_09();
    }
}
