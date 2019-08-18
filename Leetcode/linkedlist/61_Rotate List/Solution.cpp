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
    ListNode* rotateRight(ListNode* head, int k) {
        if(head==nullptr||head->next==nullptr) return head;
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
        ListNode *tail = dummy, *new_tail = dummy;
        int length = 0;
        while(tail->next!=nullptr){
            tail = tail->next; length++;
        }
        for(int i = length - k%length; i>0; i--){
            new_tail = new_tail->next;
        }
        tail->next = dummy->next;
        dummy->next = new_tail->next;
        new_tail->next = nullptr;
        return dummy->next;
    }
};
