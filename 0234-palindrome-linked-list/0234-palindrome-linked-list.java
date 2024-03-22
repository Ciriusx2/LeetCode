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
    public boolean isPalindrome(ListNode head) {
        if(head == null) 
            return true;
        
        ListNode mid = middle(head);
        ListNode last = reverseList(mid.next);
        ListNode cur = head;
        
        while(last != null) {
            if(last.val != cur.val) 
                return false;
            
            last = last.next;
            cur = cur.next;
        }
        return true;
    }
    
    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
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
