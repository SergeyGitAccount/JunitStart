package org.example.ClassWork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {
    private int step = 1;

    public void log(String message) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss.SS");
        String time = simpleDateFormat.format(new Date());
        String testName = Thread.currentThread().getName();
        System.out.println(step + ")" + time + " [" + testName +  "]: "+ message);
        step++;
    }

}
