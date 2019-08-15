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
    ListNode* sortList(ListNode* head) {
        if(head==nullptr || head->next==nullptr)
            return head;
        if(head->next->next==nullptr){
            if(head->val < head->next->val){
                return head;
            }else{
                ListNode* newHead = head->next;
                head->next->next = head; head->next = nullptr;
                return newHead;
            }
        }
        ListNode *slow = head, *fast = head->next;
        while(fast && fast->next){
            slow = slow->next;
            fast = fast->next->next;
        }
        fast = slow->next;
        slow->next = nullptr;
        head = sortList(head); slow = sortList(fast);
        ListNode *dummy = new ListNode(-1), *temp = dummy;
        while(head && slow){
            if(head->val > slow->val){
                temp->next = slow; slow = slow->next; temp = temp->next;
            } else{
                temp->next = head; head = head->next; temp = temp->next;
            }
        }
        if(head) temp->next = head;
        if(slow) temp->next = slow;
        return dummy->next;
    }
};
