package com.lypgod.test.ThinkingInJava.Ch21.Practice9;

import java.util.concurrent.ThreadFactory;

/**
 * Created by liuyp on 16-9-29.
 */
public class PriorityThreadFactory implements ThreadFactory {
    private int priority = Thread.NORM_PRIORITY;

    public PriorityThreadFactory(int prioroty) {
        this.priority = prioroty;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(priority);
        return t;
    }
}
