package com.lypgod.test.ThinkingInJava.Ch21_Concurrency.Practice2;

import java.util.concurrent.Callable;

/**
 * Created by liuyp on 16-9-28.
 */
public class FibonacciCallable implements Callable<String> {
    private String result = "";
    private int length;
    public FibonacciCallable(int n) {
        length = n;
    }

    public String call() throws InterruptedException {
        Fibonacci gen = new Fibonacci();
        for(int i = 0; i < length; i++)
            result += gen.next() + " ";
            Thread.sleep(3000);
        return result;
    }
}
