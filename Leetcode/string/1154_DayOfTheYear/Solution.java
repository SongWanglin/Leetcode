class Solution {
    public int dayOfYear(String date) {
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 3200 != 0);
        int noOfDays = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; i++) {
            if (isLeap && i == 1) {
                noOfDays += days[i] + 1;
                continue;
            }
            noOfDays += days[i];
        }
        return noOfDays + day;
    }
}

