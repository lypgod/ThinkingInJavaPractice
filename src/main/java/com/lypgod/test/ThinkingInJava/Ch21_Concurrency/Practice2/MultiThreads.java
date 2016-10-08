package com.lypgod.test.ThinkingInJava.Ch21_Concurrency.Practice2;

/**
 * Created by liuyp on 16-9-27.
 */
public class MultiThreads {
    public static void main(String[] args) {
        for (int i=0; i<20; i++) {
            new Thread(new FibonacciRunnable(10)).start();
        }
        System.out.println("Starting");
    }
}
