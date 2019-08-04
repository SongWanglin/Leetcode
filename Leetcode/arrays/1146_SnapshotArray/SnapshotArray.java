class SnapshotArray {
    List<Map<Integer, Integer>> snapshots;
    int cur_id;
    public SnapshotArray(int length) {
        snapshots = new ArrayList<>();
        cur_id = 0;
        snapshots.add(new HashMap<Integer, Integer>());
    }

    public void set(int index, int val) {
        snapshots.get(cur_id).put(index, val);
    }

    public int snap() {
        snapshots.add(new HashMap<Integer, Integer>());
        cur_id++;
        return cur_id - 1;
    }

    public int get(int index, int snap_id) {
        for(int i = snap_id ; i >= 0 ; i--) {
            Integer num = snapshots.get(i).get(index);
            if(num != null) {
                return num;
            }
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
