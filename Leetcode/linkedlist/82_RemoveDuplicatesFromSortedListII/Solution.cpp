/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        ListNode *curr = dummy, *next = dummy->next;
        while(next!=nullptr){
            while( next->next!=nullptr&&next->val==next->next->val){
                next = next->next;
            }
            if(curr->next==next){
                curr = curr->next;
            } else{
                curr->next = next->next;
            }
            next = next->next;
        }
        return dummy->next;
    }
};
