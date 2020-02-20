package easy;

import java.util.List;

/**
 * @author 喻浩
 * @create 2020-02-14-12:28
 */
public class fan_zhuan_lian_biao_lcof_mianshi24 {
    /**
     * question url:https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
     * question context :
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null){
                return  null;
            }
            
            ListNode p = head;
            ListNode q = head.next;
            p.next = null;
            while (q != null){
                ListNode temp = q.next;
                q.next = p;
                p = q;
                q = temp;
            }
            return head;
        }
    }
    public class ListNode { 
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        fan_zhuan_lian_biao_lcof_mianshi24 fan_zhuan_lian_biao_lcof_mianshi24 = new fan_zhuan_lian_biao_lcof_mianshi24();
        System.out.println(fan_zhuan_lian_biao_lcof_mianshi24.new Solution());;
    }
}
