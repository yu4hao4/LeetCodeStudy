package easy;

/**
 * @author 喻浩
 * @create 2020-05-17-10:36
 */
public class intersection_of_two_linked_lists_160 {
    /**
     * question url:https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
     * question context :
     * 编写一个程序，找到两个单链表相交的起始节点。
     */
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == headB){
                return headA;
            }

            ListNode node = headB;
            while (headA != null){

                while (node != null){
                    if (headA == node){
                        return headA;
                    }
                    node = node.next;
                }
                headA = headA.next;
                node = headB;
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
        intersection_of_two_linked_lists_160 intersection_of_two_linked_lists_160 = new intersection_of_two_linked_lists_160();
        System.out.println(intersection_of_two_linked_lists_160.new Solution());;
    }
}
