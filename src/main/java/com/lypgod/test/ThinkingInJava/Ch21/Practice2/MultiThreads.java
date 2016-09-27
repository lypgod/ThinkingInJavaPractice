package com.lypgod.test.ThinkingInJava.Ch21.Practice2;

/**
 * Created by liuyp on 16-9-27.
 */
public class MultiThreads {
    public static void main(String[] args) {
        for (int i=0; i<20; i++) {
            new Thread(new FibonacciImp(10)).start();
        }
        System.out.println("Starting");
    }
}
