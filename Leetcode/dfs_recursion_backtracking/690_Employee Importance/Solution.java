/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> ids = new HashMap<>();
        for(Employee emp: employees){
            ids.put(emp.id, emp);
        }
        int res = dfs(ids, id);
        return res;
    }
        private int dfs(HashMap<Integer, Employee> ids, int id){
            Employee cur = ids.get(id);
            int res = cur.importance;
            if(cur.subordinates.size()==0)
                return res;
            for(int ID: cur.subordinates){
                res += dfs(ids, ID);
            }
            return res;
        }
}
