package com.lypgod.test.ThinkingInJava.Ch2_Object.Practice7;

class Incrementable {
    static int i = 47;
    static void increment() { i++; }
}

public class IncrementableTest {
    public static void main(String[] args) {
        Incrementable incrementable = new Incrementable();
        System.out.println(incrementable.i);
        incrementable.increment();
        System.out.println(incrementable.i);
        Incrementable.increment();
        System.out.println(incrementable.i);
    }
}
