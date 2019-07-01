class Solution {
public:
    int maxSumAfterPartitioning(vector<int>& A, int K) {
        int n = A.size();
        vector<int> dp(n+1, 0);
        for(int i = 1; i<n+1; i++){
            int cur_max = INT_MIN;
            for(int k = 1; k<=min(i, K); k++){
                cur_max = max(cur_max, A[i-k]);
                dp[i] = max(dp[i], dp[i-k] + cur_max * k);
            }
        }
        return dp[n];
    }
};
