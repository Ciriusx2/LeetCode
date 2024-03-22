/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseHelp(head, null);
    }

    private ListNode reverseHelp(ListNode head, ListNode prev) {
        if (head == null)
            return prev;

        ListNode temp = head.next;
        head.next = prev;

        return reverseHelp(temp, head);
    }
}