/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
public:
    // iterative
    vector<int> postorder(Node* root) {
        vector<int> res;
        if(root==nullptr) return res;
        stack<Node*> stk;
        stk.push(root);
        while(!stk.empty())
        {
            Node* temp=stk.top();
            stk.pop();
            for(auto child: temp->children) stk.push(child);
            res.push_back(temp->val);
        }
        reverse(res.begin(), res.end());
        return res;
    }
    // recursive
    /*/
    vector<int> postorder(Node* root) {
        vector<int> res;
        preorder_trav(&res, root);
        return res;
    }
    void preorder_trav(vector<int>* res, Node* root){
        if(root==nullptr)
            return;
        for(auto child: root->children){
            preorder_trav(res, child);
        }
        res->push_back(root->val);
    }/*/
};
