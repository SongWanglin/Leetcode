/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
private:
    ListNode* recursiveFindAndRemove(ListNode* head, int& n){
        if(head==nullptr) return head;
        head->next = recursiveFindAndRemove(head->next, n);
        --n;
        return (n==0)? head->next: head;
    }
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int N = n;
        head = recursiveFindAndRemove(head, N);
        return head;
    }
};
