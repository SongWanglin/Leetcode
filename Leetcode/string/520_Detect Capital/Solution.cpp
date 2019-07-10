class Solution {
public:
    bool detectCapitalUse(string word) {
        if (word.size() <= 1) return true;
        bool all_lower = true, all_upper = true;
        for(int i = 1; i < word.size(); ++i)
        {
                all_upper &= (isupper(word[i])!=0);
                all_lower &= (islower(word[i])!=0);
        }
        return all_lower || (all_upper && isupper(word[0]));
    }
};
