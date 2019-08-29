class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& T) {
        stack<int> stk;
        vector<int> res(T.size());
        for(int i = 0; i<T.size(); ++i){
            while(!stk.empty() && T[stk.top()]<T[i]){
                int idx = stk.top();
                stk.pop();
                res[idx] = i - idx;
            }
            stk.push(i);
        }
        return res;
    }
};
