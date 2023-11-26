package week_09.Question_09_06;

import java.sql.Time;

public class StopWatch {
    private double startTime;
    private double endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }

}
