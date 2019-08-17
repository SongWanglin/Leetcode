/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;

    Node() {}

    Node(int _val, Node* _prev, Node* _next, Node* _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
private:
    Node* dfs(Node* head){
        if(head==nullptr) return head;
        if(head->child==nullptr){
            return (head->next==nullptr)? head: dfs(head->next);
        }
        Node* child = head->child;
        head->child = nullptr;
        Node* next = head->next;
        Node* childtail = dfs(child);
        head->next = child;
        child->prev = head;
        if(next!=nullptr){
            childtail->next = next;
            next->prev = childtail;
            return dfs(next);
        }
        return childtail;
    }
public:
    Node* flatten(Node* head) {
        dfs(head);
        return head;
    }
};
