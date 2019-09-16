class Solution {
public:
    string removeDuplicates(string S) {
        string res = "";
        for (char &c : S)
            if (res.size()==0 || c != res.back())
                res.push_back(c);
            else
                res.pop_back();
        return res;
    }
};
