package easy;

import com.sun.javafx.binding.SelectBinding;

/**
 * @author 喻浩
 * @create 2020-02-13-19:51
 */
public class lian_biao_zhong_dao_shu_di_kge_jie_dian_lcof_mianshi22 {
    /**
     * question url:https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
     * question context :
     * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
     */
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode node = head;
            int size = 0;
            while (node != null){
                size++;
                node = node.next;
            }

            while (size - k > 0){
                head = head.next;
                k++;
            }
            return head;
        }
    }
    
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        lian_biao_zhong_dao_shu_di_kge_jie_dian_lcof_mianshi22 lian_biao_zhong_dao_shu_di_kge_jie_dian_lcof_mianshi22 = new lian_biao_zhong_dao_shu_di_kge_jie_dian_lcof_mianshi22();
        System.out.println(lian_biao_zhong_dao_shu_di_kge_jie_dian_lcof_mianshi22.new Solution());;
    }
}
