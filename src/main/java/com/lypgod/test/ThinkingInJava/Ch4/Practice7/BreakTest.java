package com.lypgod.test.ThinkingInJava.Ch4.Practice7;

public class BreakTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) break;
        }
    }
}
