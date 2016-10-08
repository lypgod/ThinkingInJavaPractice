package com.lypgod.test.ThinkingInJava.Ch5_InitializationAndCleanup.Practice21;

enum Bills {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class EnumTest {
    public static void main(String[] args) {
        for(Bills b : Bills.values())
            System.out.println(b + ", ordinal " + b.ordinal());
    }
}
