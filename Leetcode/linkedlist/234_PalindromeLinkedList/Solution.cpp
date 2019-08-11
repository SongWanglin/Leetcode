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
    bool isPalindrome(ListNode* head) {
        stack<int> stk;
        ListNode* p = head;
        while(p!=nullptr){
            stk.push(p->val);
            p = p->next;
        }
        p = head;
        while(!stk.empty()){
            if(p->val!=stk.top()){
                return false;
            }
            stk.pop();
            p = p->next;
        }
        return true;
    }
};
