package easy;

/**
 * @author 喻浩
 * @create 2020-03-02-14:58
 */
public class reverse_linked_list_206 {
    /**
     * question url:https://leetcode-cn.com/problems/reverse-linked-list/
     * question context :
     * 反转一个单链表。
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode p = null;
            ListNode q = head;
            while (q != null){
                ListNode temp = q.next;
                q.next = p;
                p = q;
                q = temp;
            }
            return p;
        }
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        reverse_linked_list_206 reverse_linked_list_206 = new reverse_linked_list_206();
        System.out.println(reverse_linked_list_206.new Solution().reverseList(node1).val);
    }
}
