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
    void reorderList(ListNode* head) {
        if(!head || !head->next || !head->next->next) return;
        ListNode *temp = head, *next = head->next;
        while(temp->next->next!=nullptr){temp=temp->next;}
        head->next = temp->next;
        temp->next->next = next;
        temp->next = nullptr;
        reorderList(next);
    }
};
