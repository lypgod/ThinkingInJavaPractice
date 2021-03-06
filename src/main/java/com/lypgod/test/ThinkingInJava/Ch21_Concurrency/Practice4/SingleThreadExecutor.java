package com.lypgod.test.ThinkingInJava.Ch21_Concurrency.Practice4;

import com.lypgod.test.ThinkingInJava.Ch21_Concurrency.Practice2.FibonacciRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuyp on 16-9-27.
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i=0; i<20; i++) {
            exec.execute(new FibonacciRunnable(10));
        }
        exec.shutdown();
    }
}
