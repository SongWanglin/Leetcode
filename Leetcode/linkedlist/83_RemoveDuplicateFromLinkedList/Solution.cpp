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
        if(head==nullptr) return head;
        ListNode* temp = head;
        while(temp!=nullptr){
            while(temp->next!=nullptr && temp->val==temp->next->val){
                temp->next = temp->next->next;
            }
            temp = temp->next;
        }
        return head;
    }
};
