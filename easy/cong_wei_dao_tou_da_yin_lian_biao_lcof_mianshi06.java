package easy;

import java.util.Stack;

/**
 * @author 喻浩
 * @create 2020-02-15-11:23
 */
public class cong_wei_dao_tou_da_yin_lian_biao_lcof_mianshi06 {
    /**
     * question url:https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
     * question context :
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     */
    class Solution {
        public int[] reversePrint(ListNode head) {
            if (head == null){
                return new int[0];
            }

            Stack stack = new Stack();
            
            while (head != null){
                stack.push(head.val);
                head = head.next;
            }
            
            int[] result = new int[stack.size()];
            int i = 0;
            while (!stack.isEmpty()){
                result[i++] = (int)stack.pop();
            }
            return result;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        cong_wei_dao_tou_da_yin_lian_biao_lcof_mianshi06 cong_wei_dao_tou_da_yin_lian_biao_lcof_mianshi06 = new cong_wei_dao_tou_da_yin_lian_biao_lcof_mianshi06();
        System.out.println(cong_wei_dao_tou_da_yin_lian_biao_lcof_mianshi06.new Solution());;
    }
}
