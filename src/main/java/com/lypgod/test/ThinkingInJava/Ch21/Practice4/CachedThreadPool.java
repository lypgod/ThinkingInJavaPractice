package com.lypgod.test.ThinkingInJava.Ch21.Practice4;

import com.lypgod.test.ThinkingInJava.Ch21.Practice2.FibonacciRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuyp on 16-9-27.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0; i<20; i++) {
            exec.execute(new FibonacciRunnable(10));
        }
        exec.shutdown();
    }

}
