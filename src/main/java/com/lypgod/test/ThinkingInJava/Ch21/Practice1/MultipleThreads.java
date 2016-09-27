package com.lypgod.test.ThinkingInJava.Ch21.Practice1;

/**
 * Created by liuyp on 16-9-27.
 */
public class MultipleThreads {
    public static void main(String[] args) {
        for (int i=0; i<20; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Starting");
    }
}
