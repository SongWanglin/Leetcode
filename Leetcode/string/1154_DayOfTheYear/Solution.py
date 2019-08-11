class Solution(object):
    def dayOfYear(self, date):
        """
        :type date: str
        :rtype: int
        """
        days = date.split("-")
        year = int(days[0])
        month = int(days[1])
        day = int(days[2])
        day_arr = [31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        i = 0
        res = 0
        while i<month-1:
            res += day_arr[i]
            i += 1
        res += day
        if month > 2:
            if ((year % 4 == 0 and year % 100 != 0) or (year % 400 == 0 and year % 3200 != 0)):
                res += 29
            else:
                res += 28
        return res
