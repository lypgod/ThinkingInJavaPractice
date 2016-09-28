package com.lypgod.test.ThinkingInJava.Ch21.Practice6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuyp on 16-9-28.
 */
public class SleepDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            exec.execute(new SleepTask());
        }
        exec.shutdown();
    }
}
