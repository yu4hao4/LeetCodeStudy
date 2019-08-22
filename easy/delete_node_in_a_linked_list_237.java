package easy;

/**
 * @author 喻浩
 * @create 2019-08-19-17:18
 */
public class delete_node_in_a_linked_list_237 {
    /**
     * question url:https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
     * question context :
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
     * 
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     * 
     * 这个题目有点魔性，后面看解析才解决，大概方法就是：
     *  将该节点的值赋给下一个节点，
     *  接着将当前节点的next指向下一个节点的next
     */
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        delete_node_in_a_linked_list_237 delete_node_in_a_linked_list_237 = new delete_node_in_a_linked_list_237();
        System.out.println(delete_node_in_a_linked_list_237.new Solution());;
    }
}
