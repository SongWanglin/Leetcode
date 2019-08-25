class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> res = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i<transactions.length; i++){
            String[] temp = transactions[i].split(",");
            if(!map.containsKey(temp[0])){
                map.put(temp[0], new ArrayList<String>());
            }
            if(map.get(temp[0]).contains(transactions[i])){
                res.add(transactions[i]);
            }
            map.get(temp[0]).add(transactions[i]);
        }
        for(String s: map.keySet()){
            ArrayList<String> list = map.get(s);
            for(int i = 0; i<list.size(); i++){
                String str = list.get(i);
                String[] temp = str.split(",");
                int time1 = Integer.parseInt(temp[1]);
                int money = Integer.parseInt(temp[2]);
                if( money>1000 && !res.contains(str))
                    res.add(str);
                for(int j = i+1; j<list.size(); j++){
                    String str2 = list.get(j);
                    String[] temp2 = str2.split(",");
                    int time2 = Integer.parseInt(temp2[1]);
                    if( Math.abs(time2-time1)<=60 && !temp[3].equals(temp2[3])){
                        if(!res.contains(str)) res.add(str);
                        if(!res.contains(str2)) res.add(str2);
                     }
                }
            }
        }
        return res;
    }
}
