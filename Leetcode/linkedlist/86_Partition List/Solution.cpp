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
    ListNode* partition(ListNode* head, int x) {
        ListNode *dummy1 = new ListNode(-1), *dummy2 = new ListNode(-1),
                *smallTail = dummy1, *greatTail = dummy2;
        while(head){
            if(head->val < x){
                smallTail->next = head;
                smallTail = smallTail->next;
            }else{
                greatTail->next = head;
                greatTail = greatTail->next;
            }
            head = head->next;
        }
        greatTail->next = nullptr;
        smallTail->next = dummy2->next;
        return dummy1->next;
    }
};
