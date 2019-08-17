/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* sortedListToBST(ListNode* head) {
        if(head==nullptr) return nullptr;
        if(head->next==nullptr) return new TreeNode(head->val);
        ListNode *slow = head, *fast = head, *prev = head;
        while( fast!=nullptr && fast->next!=nullptr){
            prev = slow;
            fast = fast->next->next;
            slow = slow->next;
        }
        TreeNode* res = new TreeNode(slow->val);
        prev->next = nullptr;
        res->left = sortedListToBST(head);
        res->right = sortedListToBST(slow->next);
        return res;
    }
};
