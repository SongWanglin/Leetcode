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
    int maxDepth(Node* root) {
        /*/ //recursive
        if(root==NULL) return 0;
        int res = 0;
        for(auto child: root->children) res = max(res, maxDepth(child));
        return 1+res; /*/
        if(root==nullptr) return 0;
        queue<Node*> q;
        q.push(root);
        int res = 0;
        while(!q.empty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                Node* cur = q.front(); q.pop();
                for(auto child: cur->children) q.push(child);
            }
            res++;
        }
        return res;
    }
};
