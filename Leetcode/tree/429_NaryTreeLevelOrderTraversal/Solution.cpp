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
private:
    void bfs(vector<vector<int>>& res, Node* root, int level){
        if(root==nullptr) return;
        if(level>=res.size()) res.push_back({});
        for(int i = 0; i<root->children.size(); ++i){
            bfs(res, root->children[i], level+1);
        }
        res[level].push_back(root->val);
    }
public:
    vector<vector<int>> levelOrder(Node* root) {
        vector<vector<int>> res;
        bfs(res, root, 0);
        return res;
    }
};
