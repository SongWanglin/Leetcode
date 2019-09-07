"""
# Employee info
class Employee(object):
    def __init__(self, id, importance, subordinates):
        # It's the unique id of each node.
        # unique id of this employee
        self.id = id
        # the importance value of this employee
        self.importance = importance
        # the id of direct subordinates
        self.subordinates = subordinates
"""
class Solution(object):
    def getImportance(self, employees, id):
        """
        :type employees: Employee
        :type id: int
        :rtype: int
        """
        ids = {}
        for employee in employees:
            ids[employee.id] = employee
        def dfs(cur_id):
            cur = ids[cur_id]
            res = cur.importance
            if not cur.subordinates:
                return res
            for ID in cur.subordinates:
                res += dfs(ID)
            return res
        return dfs(id)
