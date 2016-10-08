package com.lypgod.test.ThinkingInJava.Ch21_Concurrency.Practice6;

import org.junit.Test;

import java.util.Random;

/**
 * Created by liuyp on 16-9-28.
 */
public class SleepTask implements Runnable {
    private static int idIndex = 0;
    private final int id = idIndex++;
    private int sleepTime = (new Random().nextInt(10)) * 1000;

    public void run() {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("#" + id + ": " + sleepTime);
    }

    @Test
    public void testSleepTime() {
        for (int i = 0; i < 10; i++) {
            System.out.println((new SleepTask()).sleepTime);
        }
    }
}
