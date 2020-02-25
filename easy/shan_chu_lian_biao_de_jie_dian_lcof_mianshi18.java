package easy;

/**
 * @author 喻浩
 * @create 2020-02-22-17:25
 */
public class shan_chu_lian_biao_de_jie_dian_lcof_mianshi18 {
    /**
     * question url:https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
     * question context :
     * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
     *
     * 返回删除后的链表的头节点。
     */
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            if ( head== null ){
                return null;
            }
            
            if (head.val == val){
                return head.next;
            }
            
            ListNode pre = head;
            ListNode node = head.next;
            
            while (node!=null){
                if (node.val == val){
                    pre.next = node.next;
                    break;
                }
                
                pre = node;
                node = node.next;
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
        shan_chu_lian_biao_de_jie_dian_lcof_mianshi18 shan_chu_lian_biao_de_jie_dian_lcof_mianshi18 = new shan_chu_lian_biao_de_jie_dian_lcof_mianshi18();
        System.out.println(shan_chu_lian_biao_de_jie_dian_lcof_mianshi18.new Solution());;
    }
}
