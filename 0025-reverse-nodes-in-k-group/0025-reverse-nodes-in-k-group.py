class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        if (head == None) or (head.next == None) or (k == 1): return head
        n = 0 # count
        curr = head
        while curr != None:
            n, curr = n+1, curr.next
        
        prev, next, newHead = None, None, None
        t1, t2 = None, head
        curr = head
        
        while n >= k:
            for i in range(k):
                next = curr.next
                curr.next = prev
                prev = curr
                curr = next
            
            if newHead == None: newHead = prev
            if t1 != None: t1.next = prev
            t2.next = curr # n is not multiple of k
            t1 = t2
            t2 = curr
            prev = None
            n -= k
        
        return newHead