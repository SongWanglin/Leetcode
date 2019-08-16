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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2){
        if(l1==nullptr) return l2;
        if(l2==nullptr) return l1;
        if(l1->val < l2->val){
            l1->next = mergeTwoLists(l1->next, l2);
            return l1;
        }else{
            l2->next = mergeTwoLists(l1, l2->next);
            return l2;
        }
    }
private:
    ListNode* divideAndMerge(vector<ListNode*>& lists,
                            int start, int end){
        if(start > end) return nullptr;
        if(start==end) return lists[start];
        ListNode* left = divideAndMerge(lists, start, (start+end)/2);
        ListNode* right = divideAndMerge(lists, (start+end)/2+1, end);
        return mergeTwoLists(left, right);
    }
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        return divideAndMerge(lists, 0, lists.size()-1);
    }
};

