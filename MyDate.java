public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int daysInMonth = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }
        return day >= 1 && day <= daysInMonth;
    }
    public static int getDayOfWeek(int year, int month, int day) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31 * m) / 12) % 7;
    }
    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }
    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Ngày không hợp lệ");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) this.year = year;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) this.month = month;
    }

    public void setDay(int day) {
        if (isValidDate(year, month, day)) this.day = day;
    }
    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", DAYS[dayOfWeek], day, MONTHS[month - 1], year);
    }
    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month < 12) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            year++;
        }
        return this;
    }
    public MyDate nextMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            year++;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }
    public MyDate nextYear() {
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else if (month > 1) {
            month--;
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        } else {
            month = 12;
            day = 31;
            year--;
        }
        return this;
    }
    public MyDate previousMonth() {
        if (month > 1) {
            month--;
        } else {
            month = 12;
            year--;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }
    public MyDate previousYear() {
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
}
