class DinnerPlates {
    int cap;
    map<int, vector<int>> m;
    set<int> available;
public:
    DinnerPlates(int capacity) {
        this->cap = capacity;
    }

    void push(int val) {
        if (available.size()==0)
            available.insert(m.size());
        m[*available.begin()].push_back(val);
        if(m[*available.begin()].size()==cap)
            available.erase(available.begin());
    }

    int pop() {
        if(m.size()==0)
            return -1;
        return popAtStack(m.rbegin()->first);
    }

    int popAtStack(int index) {
        if(m[index].size()==0)
            return -1;
        int val = m[index].back();
        m[index].pop_back();
        available.insert(index);
        if(m[index].size()==0)
            m.erase(index);
        return val;
    }
};

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates* obj = new DinnerPlates(capacity);
 * obj->push(val);
 * int param_2 = obj->pop();
 * int param_3 = obj->popAtStack(index);
 */
