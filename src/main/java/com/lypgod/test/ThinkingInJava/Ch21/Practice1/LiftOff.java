package com.lypgod.test.ThinkingInJava.Ch21.Practice1;

/**
 * Created by liuyp on 16-9-27.
 */
public class LiftOff implements Runnable {
    private static int idIndex = 0;
    private final int id = idIndex++;

    public LiftOff() {
        System.out.println("#" + id + ": Constructed.");
    }

    public void run() {
        System.out.println("#" + id + ": First message.");
        Thread.yield();
        System.out.println("#" + id + ": Second message.");
        Thread.yield();
        System.out.println("#" + id + ": Third message.");
        Thread.yield();
        System.out.println("#" + id + ": Finished.");
    }
}
