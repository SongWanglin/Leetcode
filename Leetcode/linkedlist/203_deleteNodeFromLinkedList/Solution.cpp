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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* dummyHead = new ListNode(-1);
        ListNode* temp = dummyHead;
        dummyHead->next = head;
        while(temp!=nullptr && temp->next!=nullptr){
            while(temp->next!=nullptr && temp->next->val==val){
                temp->next = temp->next->next;
            }
            temp = temp->next;
        }
        return dummyHead->next;
    }
};
