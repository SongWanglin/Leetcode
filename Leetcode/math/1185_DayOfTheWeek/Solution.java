class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        year -= (month < 3) ? 1 : 0;
        int res = ( year + year /4 - year /100 + year/400 + t[month-1] + day) % 7;
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[res];
    }
}
