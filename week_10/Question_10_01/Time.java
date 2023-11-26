package week_10.Question_10_01;

public class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        long millis = System.currentTimeMillis();
        int GMT = 3;
        int totalSeconds = (int) (millis / 1000);
        int totalMinutes = totalSeconds / 60;
        int totalHours = totalMinutes / 60;
        hour = (totalHours % 24) + GMT;
        minute = totalMinutes % 60;
        second = totalSeconds % 60;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(long millis) {
        int totalSeconds = (int) (millis / 1000);
        int totalMinutes = totalSeconds / 60;
        int totalHours = totalMinutes / 60;
        hour = totalHours % 24;
        minute = totalMinutes % 60;
        second = totalSeconds % 60;
    }

    public void setTime(long elapsedTime) {
        int totalSeconds = (int) (elapsedTime / 1000);
        int totalMinutes = totalSeconds / 60;
        int totalHours = totalMinutes / 60;
        hour = totalHours % 24;
        minute = totalMinutes % 60;
        second = totalSeconds % 60;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
