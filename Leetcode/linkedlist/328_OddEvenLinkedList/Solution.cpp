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
    ListNode* oddEvenList(ListNode* head) {
        if(head!=nullptr){
            ListNode* odd = head;
            ListNode* evenHead = head->next;
            ListNode* even = evenHead;
            while(even!=nullptr && even->next!=nullptr){
                odd->next = odd->next->next;
                even->next = even->next->next;
                odd = odd->next;
                even = even->next;
            }
            odd->next = evenHead;
        }
        return head;
    }
};
