class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i<dominoes.length; i++){
            int key = dominoes[i][0]+dominoes[i][1];
            if(!map.containsKey(key)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(key, list);
                continue;
            }
            ArrayList<Integer> list = map.get(key);
            list.add(i);
            map.put(key, list);
        }
        for(int key: map.keySet()){
            ArrayList<Integer> list = map.get(key);
            int n = list.size();
            //System.out.println(key+ " "+n);
            for(int i = 0; i<n-1; i++){
                int i1 = list.get(i);
                for(int j = i+1; j<n; j++){
                    int j1 = list.get(j);
                    if(dominoes[i1][0]==dominoes[j1][0]||dominoes[i1][0]==dominoes[j1][1])
                        res++;
                }
            }
        }
        return res;
    }
}
