public class Mytime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Mytime() {
    }

    public Mytime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) this.hour = hour;
        if (minute >= 0 && minute < 60) this.minute = minute;
        if (second >= 0 && second < 60) this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
      if (minute >= 0 && minute < 60)  this.minute = minute;
    }

    public int getSecond() {
       return second;
    }

    public void setSecond(int second) {
      if (second >= 0 && second < 60)  this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
    public Mytime nextSecond() {
        if (++second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }
    public Mytime nextMinute() {
        if (++minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }
    public Mytime nextHour() {
        if (++hour == 24) {
            hour = 0;
        }
        return this;
    }
    public Mytime previousSecond() {
        if (--second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }
    public Mytime previousMinute() {
        if (--minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }
    public Mytime previousHour() {
        if (--hour < 0) {
            hour = 23;
        }
        return this;
    }
}
