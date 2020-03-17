package medium;

/**
 * @author 喻浩
 * @create 2020-03-16-11:18
 */
public class add_two_numbers_2 {
    /**
     * question url:https://leetcode-cn.com/problems/add-two-numbers/
     * question context :给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null){
                return l2;
            }

            if (l2 == null){
                return l1;
            }

            ListNode node = new ListNode(0);
            ListNode ans = node;

            while (l1 != null || l2 != null){
                if (l1 != null && l2 != null){
                    node.val = node.val + l1.val + l2.val;
                }
                if (l1 != null && l2 == null){
                    node.val = node.val + l1.val;
                }

                if (l2 != null && l1 == null){
                    node.val = node.val + l2.val;
                }

                if (l1 != null){
                    l1 = l1.next;
                }

                if (l2 != null){
                    l2 = l2.next;
                }


                if (node.val >= 10){
                    node.next = new ListNode(node.val/10);
                    node.val = node.val%10;
                }

                if (node.next == null){
                    node.next = new ListNode(0);
                }
                node = node.next;
            }

            ListNode temp = ans;
            while (temp.next != node){
                temp = temp.next;
            }

            if (node.val == 0){
                temp.next = null;
            }

            return ans;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        add_two_numbers_2 add_two_numbers_2 = new add_two_numbers_2();
        System.out.println(
                add_two_numbers_2.new Solution().addTwoNumbers(new ListNode(5),new ListNode(5)).next.val
        );
    }
}
