package com.lypgod.test.ThinkingInJava.Ch5.Practice21;

enum Bills {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class EnumTest {
    public static void main(String[] args) {
        for(Bills b : Bills.values())
            System.out.println(b + ", ordinal " + b.ordinal());
    }
}
