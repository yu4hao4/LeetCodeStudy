package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-02-21-17:32
 */
public class liang_ge_lian_biao_de_di_yi_ge_gong_gong_jie_dian_lcof_mianshi52 {
    /**
     * question url:https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
     * question context :
     * 输入两个链表，找出它们的第一个公共节点。
     */
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> set = new HashSet();
            while (headA != null || headB != null){
                if (headA != null){
                    if (set.contains(headA)){
                        return headA;
                    }
                    set.add(headA);
                    headA = headA.next;
                }
                
                if (headB != null){
                    if (set.contains(headB)){
                        return headB;
                    }
                    set.add(headB);
                    headB = headB.next;
                }
            }
            
            return null;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;

        }
    }
    
    public static void main(String[] args) {
        liang_ge_lian_biao_de_di_yi_ge_gong_gong_jie_dian_lcof_mianshi52 liang_ge_lian_biao_de_di_yi_ge_gong_gong_jie_dian_lcof_mianshi52 = new liang_ge_lian_biao_de_di_yi_ge_gong_gong_jie_dian_lcof_mianshi52();
        System.out.println(liang_ge_lian_biao_de_di_yi_ge_gong_gong_jie_dian_lcof_mianshi52.new Solution());;
    }
}
