package com.lypgod.test.ThinkingInJava.Ch21_Concurrency.Examples;//: concurrency/IntGenerator.java

public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    // Allow this to be canceled:
    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
} ///:~
