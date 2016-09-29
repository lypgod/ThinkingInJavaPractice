package com.lypgod.test.ThinkingInJava.Ch21.Practice5;

import com.lypgod.test.ThinkingInJava.Ch21.Practice2.FibonacciCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<>();
        for (int i=0; i<20; i++) {
            results.add(exec.submit(new FibonacciCallable(10)));
        }
        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}
