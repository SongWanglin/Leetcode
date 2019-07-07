class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people==null || people.length==0 || people[0].length==0) return new int[0][0];
        Arrays.sort(people, new Comparator<int []>(){
            public int compare(int[] a, int[] b){
                return (a[0]!=b[0])? a[0]-b[0]: b[1] - a[1];
            }
        });
        int[][] res = new int[people.length][people[0].length];
        List<Integer> indices = new ArrayList<>();
        for(int i = 0; i < people.length; i++){
            indices.add(i);
        }
        for(int i = 0; i < people.length; i++){
            int index = indices.get(people[i][1]);
            indices.remove(people[i][1]);
            res[index][0] = people[i][0];
            res[index][1] = people[i][1];
        }
        return res;
    }
}
