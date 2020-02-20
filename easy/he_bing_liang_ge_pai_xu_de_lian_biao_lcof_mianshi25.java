package easy;

/**
 * @author 喻浩
 * @create 2020-02-15-11:44
 */
public class he_bing_liang_ge_pai_xu_de_lian_biao_lcof_mianshi25 {
    /**
     * question url:https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
     * question context :
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            
            if (l1 == null){
                return l2;
            }
            
            if (l2 == null){
                return l1;
            }
            
            ListNode temp = new ListNode(0);
            ListNode result = temp;

            while (l1 != null && l2 != null){
                if (l1.val < l2.val){
                    temp.next = l1;
                    l1 = l1.next;
                }else{
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp = temp.next;
            }
            
            if(l1 != null){
                temp.next = l1;
            }
            
            if (l2 != null){
                temp.next = l2;
            }
            
            return result.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        he_bing_liang_ge_pai_xu_de_lian_biao_lcof_mianshi25 he_bing_liang_ge_pai_xu_de_lian_biao_lcof_mianshi25 = new he_bing_liang_ge_pai_xu_de_lian_biao_lcof_mianshi25();
        System.out.println(he_bing_liang_ge_pai_xu_de_lian_biao_lcof_mianshi25.new Solution());;
    }
}
