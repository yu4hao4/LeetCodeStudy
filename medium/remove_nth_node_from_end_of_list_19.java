/**
 * @author 喻浩
 * @create 2020-05-09-19:19
 */
public class remove_nth_node_from_end_of_list_19 {
    /**
     * question url:
     * question context :
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null){
                return head;
            }

            if (head.next == null && n == 1){
                return null;
            }

            ListNode node1 = head;
            ListNode node2 = head;
            int len = 1;
            while (node2 != null && node2.next != null){
                node1 = node1.next;
                len++;
                if (node2.next.next != null){
                    len++;
                }
                node2 = node2.next.next;
            }

            if (n == len){
                return head.next;
            }

            len -= n;
            node1 = head;
            while (len > 0){
                node2 = node1;
                node1 = node1.next;
                len --;
            }
//
//            System.out.println(node1.val);
//            System.out.println(node2.val);

            node2.next = node1.next;

            return head;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(2);
        node1.next.next.next = new ListNode(3);
        node1.next.next.next.next = new ListNode(4);
        remove_nth_node_from_end_of_list_19 remove_nth_node_from_end_of_list_19 = new remove_nth_node_from_end_of_list_19();
        System.out.println(remove_nth_node_from_end_of_list_19.new Solution().removeNthFromEnd(node1, 1));
    }
}
