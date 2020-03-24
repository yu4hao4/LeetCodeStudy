package easy;

/**
 * @author 喻浩
 * @create 2020-03-23-14:45
 */
public class middle_of_the_linked_list_876 {
    /**
     * question url:https://leetcode-cn.com/problems/middle-of-the-linked-list/
     * question context :
     * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
     *
     * 如果有两个中间结点，则返回第二个中间结点
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode cur = head;
            ListNode next = head;
            while (next != null && next.next != null){
                cur = cur.next;
                if (next.next != null){
                    next = next.next;
                    if (next.next != null){
                        next = next.next;
                    }else {
                        next = null;
                    }
                }else {
                    next = null;
                }
            }
            return cur;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        middle_of_the_linked_list_876 middle_of_the_linked_list_876 = new middle_of_the_linked_list_876();
        System.out.println(middle_of_the_linked_list_876.new Solution());;
    }
}
