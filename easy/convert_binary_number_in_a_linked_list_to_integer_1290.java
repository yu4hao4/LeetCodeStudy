package easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 喻浩
 * @create 2020-01-15-16:06
 */
public class convert_binary_number_in_a_linked_list_to_integer_1290 {
    /**
     * question url:https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
     * question context :
     * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
     * 请你返回该链表所表示数字的 十进制值 。
     */
    class Solution {
        public int getDecimalValue(ListNode head) {
            ListNode node = head;
            int result = 0;
            while(node != null){
                result <<= 1;
                result += node.val;
                node = node.next;
            }
            
            return result;
        }
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
//        [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        convert_binary_number_in_a_linked_list_to_integer_1290 convert_binary_number_in_a_linked_list_to_integer_1290 = new convert_binary_number_in_a_linked_list_to_integer_1290();
        System.out.println(convert_binary_number_in_a_linked_list_to_integer_1290.new Solution().getDecimalValue(node1));;
    }
}
