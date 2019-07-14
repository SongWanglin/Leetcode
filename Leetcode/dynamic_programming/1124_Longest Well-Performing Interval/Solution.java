class Solution {
    public int[] smallestSufficientTeam(
        String[] req, List<List<String>> p) {
        int target = (1 << req.length) - 1;
        int[] pv = new int[p.size()];
        for(int j = 0 ; j < p.size(); j++) {
            Set<String> set = new HashSet<>(p.get(j));
            int v = 0;
            for(int i = 0; i < req.length; i++) if(set.contains(req[i])) v |= 1 << i;
            pv[j] = v;
        }

        List<Integer> res = new ArrayList<>();
        dfs(target, pv, 0, 0, new ArrayList<>(), res);
        int[] ret = new int[res.size()];
        for(int i = 0; i < res.size(); i++) ret[i] = res.get(i);
        return ret;
    }
        void dfs(int target, int[] pv, int idx, int cur, List<Integer> list, List<Integer> res) {
            if(res.size() != 0 && list.size() > res.size()) return;//pruning
            if(cur == target) {
                if(res.size() == 0 || res.size() > list.size()) {
                    res.clear();
                    for(int e : list) res.add(e);
                }
                return;
            }
            if(idx == pv.length) return;

            if(cur != (cur|pv[idx])) {//pruning
                list.add(idx);
                dfs(target, pv, idx + 1, cur|pv[idx], list, res);
                list.remove(list.size() - 1);
            }

            dfs(target, pv, idx + 1, cur, list, res);
        }
}
