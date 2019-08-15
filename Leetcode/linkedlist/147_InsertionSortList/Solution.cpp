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
    ListNode* insertionSortList(ListNode* head) {
        ListNode *dummy = new ListNode(INT_MIN);
        ListNode *temp = dummy, *curr = head, *next = head;
        while(curr!=nullptr){
            temp = dummy;
            next = curr->next;
            curr->next = nullptr;
            while(temp->next && curr->val>temp->next->val){
                temp = temp->next;
            }
            curr->next = temp->next;
            temp->next = curr;
            curr = next;
        }
        return dummy->next;
    }
};
