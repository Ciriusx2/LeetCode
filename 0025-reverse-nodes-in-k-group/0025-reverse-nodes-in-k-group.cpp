class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        if(!head || !head->next || k == 1) return head;
        int n = 0; // count
        ListNode *curr = head;
        while(curr){
            n++;
            curr = curr->next;
        }
        
        ListNode *prev = nullptr, *next, *newHead; 
        ListNode *t1 = nullptr, *t2 = head;
        curr = head;
        
        while(n >= k){
            for(int i = 0; i < k; i++){
                next = curr->next;
                curr->next = prev;
                prev = curr;
                curr = next;
            }
            if(!newHead) newHead = prev;
            if(t1) t1->next = prev;
            t2->next = curr; // n is not multiple of k
            t1 = t2;
            t2 = curr;
            prev = nullptr;
            n -= k;
        }
        return newHead;
    }
};
