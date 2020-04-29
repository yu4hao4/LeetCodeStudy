/**
 * @author 喻浩
 * @create 2020-04-29-13:48
 */
public class rotate_list_61 {
    /**
     * question url:https://leetcode-cn.com/problems/rotate-list/
     * question context :
     * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null){
                return head;
            }

            ListNode node = head;
            int len = 0;
            while (node != null){
                len++;
                node = node.next;
            }

            while (k >= len){
                k = k % len;
            }

            if (k == 0 || len == 0 || len == 1){
                return head;
            }

            ListNode ans = new ListNode(0);
            int index = 0;
            int location = len - k + index;
            ListNode temp = ans;
//            System.out.println(location);
            int tempLen = len;
            while (len > 0){
                node = head;
                int l = location;
                while (location > 0){
                    node = node.next;
                    location--;
                }
                temp.next = new ListNode(node.val);
                temp = temp.next;
                index++;
                location = (l + 1)%tempLen;
                len--;
            }

            return ans.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(5);
        rotate_list_61 rotate_list_61 = new rotate_list_61();
        ListNode listNode = rotate_list_61.new Solution().rotateRight(node.next, 10);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
