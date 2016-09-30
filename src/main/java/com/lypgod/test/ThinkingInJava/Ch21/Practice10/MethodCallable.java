package com.lypgod.test.ThinkingInJava.Ch21.Practice10;

import com.lypgod.test.ThinkingInJava.Ch21.Practice2.FibonacciCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadMethod {
    public String runTask() {
        ExecutorService exec = Executors.newSingleThreadExecutor();

        try {
            return exec.submit(new FibonacciCallable(10)).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            exec.shutdown();
        }

        return null;
    }
}

public class MethodCallable {
    public static void main(String[] args) {
        System.out.println(new ThreadMethod().runTask());
    }
}
