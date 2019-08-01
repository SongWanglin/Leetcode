class Solution {
public:
    int findLHS(vector<int>& nums) {
        unordered_map<int,int>m;
        int res = 0;
        for(auto i: nums){
            m[i]++;
            if(m.count(i+1))
                res = max(res, m[i] + m[i+1]);
            if(m.count(i-1))
                res = max(res, m[i] + m[i-1]);
        }
        return res;
    }
};
