package com.lypgod.test.ThinkingInJava.Ch16_Arrays.Practice13;

public class Practice13 {
    public static void main(String[] args) {
        String s = "";
        CountingGenerator.Character c = new CountingGenerator.Character();
        for (int i = 0; i < 60; i++) {
            s += c.next();
        }
        System.out.println(s);
    }
}
